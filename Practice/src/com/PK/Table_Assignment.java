package com.PK;

public class Table_Assignment {
	
	int table_[] = new int[10];	
	int value_;
		
	public Table_Assignment(int value) {
		this.value_ = value;
		CalcTable(value);
		display(table_);
	}
	
	public int[] CalcTable(int value) {
		for(int i = 0; i < table_.length; i++ ) {
			table_[i] = value*(i+1);
		}		
		return table_;		
	}
	
	public void display(int table[]) {
		int i = 1;
		System.out.println("Below mentioned is the table of "+ value_);
		for(int print_table: table) {
			System.out.println(value_ + " x " + i + " = " + print_table);		
			i++;
		}		
	}
	

}
