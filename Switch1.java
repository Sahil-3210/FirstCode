public class Switch1{

    public static void main(String[] args) {
        
//         // switch(expression) {
//         //     case x:
//         //       // code block
//         //       break;
//         //     case y:
//         //       // code block
//         //       break;
//         //     default:
//         //       // code block
//         //   }



//             int day = 4;
//             String daytime = "";
//             switch(day){
//                 case 1:
//                 // System.out.println("Monday");
//                 daytime = "Monday";
//                 break;

//                 case 2:
//                 // System.out.println("Tuesday");
//                 daytime = "Tuesday";
//                 break;

//                 case 3:
//                 // System.out.println("wed");
//                 daytime = "Wednesday";
//                 break;

//                 case 4:
//                 // System.out.println("sun");
//                 daytime = "Thursday";
//                 break;

//                 default:
//                 daytime = "Invalid day";

//              }
//              System.out.println("Its " + daytime + " today.");




        String size = "large";
        int price= 0;
        switch (size) {
            case "mini":
                price = 80;
                break;

            case "small":
                price = 100;
                break;

            case "medium":
                price = 150;
                break;

            case "large":
                price = 180;
                break;
        
            default:
                break;
        }
        System.out.println("The price of a " + size + " coffee is $" + price);


    }
}