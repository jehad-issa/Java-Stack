public  class  CafeJava {
    public  static  void main( String [] args) {
         // APP VARIABLES 
        // Lines of text that will appear in the app 
        String greetGeneral =  "Welcome to Cafe Java, " ;
        String MensajePendiente =  ", your order will be ready shortly" ;
        String MessagingReady =  ", your order is ready" ;
        String MensajeMostrarTotal =  "Your total is $" ;
        
        // Menu variables (add yours below) 
        double MochaPrice =  3.5 ;
        double dripCofeePrice = 2.0;
        double lattePrice = 4.5;
        double cappucinoPrice = 2.5;
    
        // Client name variables (add yours below) 
        String client1 =  "Cindhuri";
        String client2 =  "Sam";
        String client3 =  "Jimmy";
        String client4 =  "Noah";



    
        // Order completions (add yours below) 
        boolean isOrderReady1 =  false ;
        boolean isOrderReady2 =  true ;
        boolean isOrderReady3 =  false ;
        boolean isOrderReady4 =  true ;



    
        // SIMULATION OF APP INTERACTION(Add your code for the challenges below) 
        // Example: 
        System.out.println(greetGeneral + client1); // Display "Welcome to Café Java, Cindhuri" 
    	// ** Print statements about customer interactions will go here ** //
        System .out.println(client1 + MensajePendiente );

        if (isOrderReady4) {
            System .out.println(client4 + MessagingReady );
            System .out.println(MensajeMostrarTotal + cappucinoPrice );
        }
        else {
            System .out.println(client4 + MensajePendiente );
        }
            System .out.println(MensajeMostrarTotal + lattePrice * 2 );
        if (isOrderReady2) {
            System .out.println(client2 + MessagingReady );
        }
        else {
            System .out.println(client2 + MensajePendiente );
        }
            System .out.println(MensajeMostrarTotal + (lattePrice - dripCofeePrice ));


    }
}