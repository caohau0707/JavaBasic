package day1;

public class DataTypesAndVariables {

	public static void main(String[] args) {
		//Bài 1: In “Hello World”
        String message = "Hello World";
        System.out.println(message);
        
        //Bài 2: In các ký hiệu đặc biệt
        System.out.println("++++++");
        System.out.println("@@@@@@");
        System.out.println("******");
        System.out.println("######");

       // Bài 3: Khai báo biến a, b, c
        int a = 10;
        float b = 20.3f;
        double c = 3.14785;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        //  Bài 4: Biến boolean thay đổi giá trị
        boolean flag = true;
        flag = false;
        System.out.println("Boolean value is: " + flag);

        // Bài 5: Tìm lỗi cú pháp

        /*
        public static void main(String[] args) {
            System.out.println("ToolsQA")   //  Thiếu dấu chấm phẩy ;
        }

        public static void main(String[] args) {
            System.out.println('ToolsQA');  // Dùng dấu nháy đơn thay vì nháy kép
        }

        public static void main(String[] args) {
            integer value = 18;             // Sai kiểu, phải là int, không phải "integer"
            System.out.println("The value of the integer variable is : " + value);
        }

        public static void main(String[] args) {
            valueInt int  = 18;             //  Sai cú pháp khai báo
            valueDob double = 10.10;
            valueBool boolean = true;
        }
        */
        
	}

}
