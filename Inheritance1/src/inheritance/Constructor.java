package inheritance;
 class student {
	
		int id;
		String name;
		String city;
		
		student(int id,String name)
		{
			this.id=id;
			this.name=name;
			
		}
		student(int id,String name,String city)
		{
			this.id=id;
			this.name=name;
			this.city=city;
			
		}
		public String display() {
			return "student [id=" + id + ", name=" + name + ", city=" + city + "]";
		}
		public static void main(String[] args) {
			student s =new student(1,"Sathish");
			s.display();
			
		}
		
		
		
		
		
		
		
		
	}

}
