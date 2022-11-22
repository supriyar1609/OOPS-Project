package com.axis.service
import com.axis.model.Employee

//in service class we write the business logic
class EmployeeService {
    /*
    description: this method is used to display employee details
    parameter: it takes employee object are param
    returns:it returns unit
     */
    fun displayEmployeeDetails(employee:Employee){
        println("======Employee Details======")
        println("id= ${employee.id}")
        println("name = ${employee.name}")
        println("salary = ${employee.salary}")
    }

    /*
    to find per day salary
     */
    fun perDaySalray(employee: Employee):Int{
        return employee.salary/30
    }

    fun increaseSalByTenPercent(employee: Employee):Double{
        var incrementedsalary :Double =employee.salary*0.10
        println("Incremented salary is : $incrementedsalary")
        return employee.salary + incrementedsalary
    }
}