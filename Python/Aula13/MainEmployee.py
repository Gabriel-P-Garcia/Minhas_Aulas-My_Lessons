from EmployeeClass import Employee,FullTimeEmployee,HourlyEmployee

if __name__ == '__main__':
    full_time1 = FullTimeEmployee('Sleve','McDichael',5000.00)
    full_time2 = FullTimeEmployee('Mike','Sernandez', 10000.00)
    hourly1 = HourlyEmployee('Anatoli','Smorin',150,30.00)
    hourly2 = HourlyEmployee('Glenallen','Mixon',220)

    print('Name: ', full_time1.get_full_name(),', base salary: ', full_time1.get_base_salary(),', total pay: ', full_time1.calc_pay())

    print('Name: ', hourly2.get_full_name(),', hours worked: ', hourly2.get_worked_hours(),', total pay: ', hourly2.calc_pay())

    print(hourly1.get_value_hour())

    full_time2.set_last_name('Truk')
    full_time2.set_base_salary(11000.00)

    print('Name: ', full_time2.get_full_name(), ', base salary: ', full_time2.get_base_salary(), ', total pay: ', full_time2.calc_pay())

    full_time2.set_first_name('Shown')

    print('Name: ', full_time2.get_full_name(), ', base salary: ', full_time2.get_base_salary(), ', total pay: ', full_time2.calc_pay())

    print('Name: ', hourly1.get_full_name(),', hours worked: ', hourly1.get_worked_hours(),', total pay: ', hourly1.calc_pay())

    hourly1.set_first_name('Todd')
    hourly1.set_last_name('Bonzalez')
    hourly1.set_value_hour(35)
    hourly1.set_worked_hours(200)

    print('Name: ', hourly1.get_full_name(),', hours worked: ', hourly1.get_worked_hours(),', total pay: ', hourly1.calc_pay())

    print(Employee.get_count_employee(), ' employees')
