package com.customerorders.RestCRUDapi.controller;

import com.customerorders.RestCRUDapi.method.Customer;
import com.customerorders.RestCRUDapi.service.ICustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ICustomerService customerService;

    @PostMapping("")
    public String saveCustomer(@RequestBody Customer customer) {
         try {
            customerService.save(customer);
        } catch (Exception e) {
            log.error("unable to save customer", e);
            e.printStackTrace();
            return "error";
        }
        return "customer saved";
    }

  @RequestMapping(value = "/start", method = RequestMethod.GET, headers = {"content-type= text/json"})
    @ResponseBody
    public Customer readJSON(Model model) {
        Customer customer = customerService.fetchById(2);
        model.addAttribute("customer", customer);
        return customer;
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable(value = "id")Integer id){
        return customerService.getCustomer(id);
    }

    @GetMapping("")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/name/{name}")
    public List<Customer> getAllCustomersByName(@PathVariable(value="name") String name){
        return customerService.getAllCustomersByName(name);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable(value="id") Integer id) {
    	customerService.deleteCustomer(id);
    }
    
    @PutMapping("/update/{id}")
    public void updateCustomer(@PathVariable(value = "id") Integer id,@RequestBody Customer customer) {
    	customerService.updateCustomer(customer);
    }
    	
    
    
   

   /* @GetMapping("/search")
    public List<Customer> getAllCustomersByNameCountry(@RequestParam(required = false, value = "name") String name, @RequestParam(required = false, value = "country") String country){
        return customerService.getAllCustomersByNameCountry(name,country);
    }*/

}
