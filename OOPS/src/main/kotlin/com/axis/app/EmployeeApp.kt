package com.axis.app
import com.axis.model.Employee
import com.axis.service.EmployeeService

fun main(args: Array<String>) {
    println("=====Employee App=====")
    var employee=Employee(16,"Supriya",25000)
    var employeeService=EmployeeService()

    employeeService.displayEmployeeDetails(employee)

    println("Per Day Salary : ${employeeService.perDaySalray(employee)}")
    println("Increased Salary by 10% : ${employeeService.increaseSalByTenPercent(employee)}")
}
