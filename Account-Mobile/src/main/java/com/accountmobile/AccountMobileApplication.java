package com.accountmobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountMobileApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMobileApplication.class, args);
	}
}



//<form [formGroup]="searchForm" (ngSubmit)="searchById()">
//<div class="form-group">
//    <label for="">Id</label>
//    <input type="text" formControlName="employeeId">
//    <button type="submit">Search</button>
//</div>
//<table class="table">
//    <thead>
//      <tr>
//        <th scope="col">Id</th>
//        <th scope="col">Name</th>
//        <th scope="col">Salary</th>
//        <th scope="col">Email</th>
//        <th scope="col">Contact</th>
//      </tr>
//    </thead>
//    <tbody>
//      <tr>
//        <th>{{response.employeeId}}</th>
//        <td>{{response.employeeName}}</td>
//        <td>{{response.employeeSalary}}</td>
//        <td>{{response.employeeEmail}}</td>
//        <td>{{response.employeeContactNo}}</td>
//      </tr>
//      </tbody>
//</table>
//</form> -->

//
//getById(data:number){
//    return this.httpcall.get("http://localhost:8189/api/v1/employees/"+data);
//  }
//
//}

