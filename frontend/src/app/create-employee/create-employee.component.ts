import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {

  employee: Employee = new Employee();
  constructor(private employeeService: EmployeeService,
    private router: Router) { }

  ngOnInit(): void {
  }

  saveEmployee(){
    this.employeeService.createEmployee(this.employee).subscribe( data =>{
      console.log(data);
      this.goToEmployeeList();
    },
    error => {
      console.log(error.error.message);
      
      const str = error.error.message;

      const startWord = "interpolatedMessage='";
      const endWord = "'";
      // Construct the regular expression pattern
      const pattern = new RegExp(`${startWord}(.*?)(?=${endWord})`, "g");
      // Find all matched substrings using RegExp.match()
      const matches = str.match(pattern);
      const result = matches ? matches.map((match: string) => match.slice(startWord.length)) : [];
      result.forEach((element: string) => {
        alert(element);
      });  
      console.log(result); 
    });
  }

  goToEmployeeList(){
    this.router.navigate(['/employees']);
  }
  
  onSubmit(){
    console.log(this.employee);
    this.saveEmployee();
  }
}