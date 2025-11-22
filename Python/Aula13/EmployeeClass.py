from abc import ABC, abstractmethod


class Employee(ABC):

    count_employee = 0
    @classmethod
    def get_count_employee(cls):
        return cls.count_employee

    def __init__(self,first_name,last_name):
        self.first_name =  first_name
        self.last_name = last_name
        Employee.count_employee += 1

    def get_first_name(self):
        return self.first_name
    def get_last_name(self):
        return self.last_name

    def get_full_name(self):
        full_name = self.first_name + ' ' + self.last_name
        return full_name

    def set_first_name(self,new_first):
        self.first_name = new_first
    def set_last_name(self,new_last):
        self.last_name = new_last

    @abstractmethod
    def calc_pay(self):
        ...

class FullTimeEmployee(Employee):
    def __init__(self,first_name,last_name,base_salary):
        super().__init__(first_name,last_name)
        self.base_salary = base_salary

    def get_base_salary(self):
        return self.base_salary

    def set_base_salary(self,new_base):
        self.base_salary = new_base

    def calc_pay(self):
        return self.base_salary + 200

class HourlyEmployee(Employee):
    def __init__(self,first_name,last_name,worked_hours,value_hour = 20):
        super().__init__(first_name,last_name)
        self.worked_hours = worked_hours
        self.value_hour = value_hour

    def get_worked_hours(self):
        return self.worked_hours
    def get_value_hour(self):
        return self.value_hour

    def set_worked_hours(self,new_worked_hours):
        self.worked_hours = new_worked_hours
    def set_value_hour(self,new_value):
        self.worked_hours = new_value

    def calc_pay(self,):
        return self.value_hour * self.worked_hours
