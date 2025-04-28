import java.util.*;
import java.lang.*;



class ShoppingMall {
	int customerId;
	int phoneNo;
	String customerName;
	String city;
	long productId;
	
	
	String billing(double amount,long productId) {
		
		return"your total bill:"+this.productId;
			
	}
	
	String discount(String productId,long mrp) {
		
		return"your discount on product:"+this.productId;
		
	}
}
	

class More extends Thread {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Welcome to More");
		ShoppingMall sm = new ShoppingMall();
		sm.customerId = 2001;
		sm.phoneNo = 9642;
		sm.customerName = "phanindra";
		sm.city = "chilakaluripet";
		sm.productId = 1620;
		Scanner sc = new Scanner(System.in);
		
		
		int a = 10;
		int b = 20;
		int c = 20;
		 
		if(a<b) {
			System.out.println("opening  doors");
			Thread.sleep(1000);
		}
			if(c == b) {
				System.out.println("Good morning");
				Thread.sleep(500);
			}
			System.out.println("Complementry Chocolate");
				Thread.sleep(1000);
					Floor f = new Floor();
					System.out.println("First Floor Grocerys" + " > " + f.solution(1,0));
					System.out.println("second floor Cloths" + " > " + f.solution(1,2,1,2));
					System.out.println("Third Floor Electronics" + " > " + f.solution(1,1,1));
					
					Thread.sleep(500);
						 List<String> selectedItems = new ArrayList<>();
        int total = 0;

        while (true) {
            System.out.println("\nSelect category:\n1. Groceries\n2. Clothes\n3. Electronics\n4. Exit & View Cart");
            System.out.print("Enter your choice: ");
            int s = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (s) {
                case 1:
                    Thread.sleep(500);
                    String[] groceries = {
                        "1. Santoor", "2. Mysoresandal", "3. Dal", "4. Sujirava", "5. Vermicelli",
                        "6. Peanuts", "7. Soyabenas", "8. Cashewnuts", "9. Pista"
                    };
                    int[] groceryPrices = {35, 45, 50, 50, 40, 60, 50, 160, 120};

                    System.out.println("\nSelect grocery items (e.g., 1,3,5):");
                    for (String item : groceries) {
                        System.out.println(item);
                    }

                    System.out.print("Enter your choices: ");
                    String input1 = sc.nextLine();
                    String[] choices1 = input1.split(",");
                    for (String choice : choices1) {
                        try {
                            int index = Integer.parseInt(choice.trim()) - 1;
                            if (index >= 0 && index < groceries.length) {
                                String selected = groceries[index] + " > ₹" + groceryPrices[index];
                                selectedItems.add(selected);
                                total += groceryPrices[index];
                            } else {
                                System.out.println("Invalid choice: " + choice);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input: " + choice);
                        }
                    }
                    break;

                case 2:
                    Thread.sleep(500);
                    String[] clothes = {"1. Shirt", "2. Pant", "3. Short", "4. Hoodie", "5. Tshirt"};
                    int[] clothesPrices = {700, 1000, 350, 2000, 200};

                    System.out.println("\nSelect clothing items (e.g., 1,3,5):");
                    for (String item : clothes) {
                        System.out.println(item);
                    }

                    System.out.print("Enter your choices: ");
                    String input2 = sc.nextLine();
                    String[] choices2 = input2.split(",");
                    for (String choice : choices2) {
                        try {
                            int index = Integer.parseInt(choice.trim()) - 1;
                            if (index >= 0 && index < clothes.length) {
                                String selected = clothes[index] + " > ₹" + clothesPrices[index];
                                selectedItems.add(selected);
                                total += clothesPrices[index];
                            } else {
                                System.out.println("Invalid choice: " + choice);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input: " + choice);
                        }
                    }
                    break;

                case 3:
                    Thread.sleep(500);
                    String[] electronics = {
                        "1. Washing Machine", "2. Refrigerator", "3. Air Conditioner", "4. Mobiles",
                        "5. Laptops", "6. Television", "7. iPads"
                    };
                    int[] electronicPrices = {10000, 8000, 18000, 9000, 40000, 5000, 3000};

                    System.out.println("Select electronic items (e.g., 1,3,5):");
                    for (String item : electronics) {
                        System.out.println(item);
                    }

                    System.out.print("Enter your choices: ");
                    String input3 = sc.nextLine();
                    String[] choices3 = input3.split(",");
                    for (String choice : choices3) {
                        try {
                            int index = Integer.parseInt(choice.trim()) - 1;
                            if (index >= 0 && index < electronics.length) {
                                String selected = electronics[index] + " > ₹" + electronicPrices[index];
                                selectedItems.add(selected);
                                total += electronicPrices[index];
                            } else {
                                System.out.println("Invalid choice: " + choice);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input: " + choice);
                        }
                    }
                    break;

             case 4:
					if (selectedItems.isEmpty()) {
						System.out.println(" No items selected. Exiting the store...");
						Thread.sleep(1000);
						System.exit(0); // immediate exit
					}

					// Simulate scanning
					System.out.println(" Scanning products for billing...");
					Thread.sleep(1500);

					// Show Cart
					System.out.println(" My Products (Cart):");
					for (String item : selectedItems) {
						System.out.println(item);
					}
					System.out.println("Total Amount: ₹" + total);

					// Ask Payment Method
					System.out.println("Select payment method:");
					System.out.println("\n1. Cash\n2. Card\n3. Online");
					System.out.print("Enter your choice: ");
					int paymentOption = sc.nextInt();
					sc.nextLine(); // consume newline

					switch (paymentOption) {
						case 1:
							System.out.println("You selected: Cash. Please pay at the counter.");
							break;
						case 2:
							System.out.println("You selected: Card. Please insert or tap your card.");
							break;
						case 3:
							System.out.println("You selected: Online. Please proceed with UPI or net banking.");
							break;
						default:
							System.out.println("Invalid payment option. Defaulting to cash.");
					}

					System.out.println("Payment successful. Thank you for shopping!");
					
					System.out.println("\n========== RECEIPT ==========");
					System.out.println("Customer Name: " + sm.customerName);
					System.out.println("Customer ID: " + sm.customerId);
					System.out.println("Phone Number: " + sm.phoneNo);
					System.out.println("City: " + sm.city);
					System.out.println("-----------------------------");
					System.out.println("Items Purchased:");
					for (String item : selectedItems) {
						System.out.println("- " + item);
					}
					System.out.println("-----------------------------");
					System.out.println("Total Amount Paid: ₹" + total);

					String paymentMethod = "";
					switch (paymentOption) {
						case 1: paymentMethod = "Cash"; break;
						case 2: paymentMethod = "Card"; break;
						case 3: paymentMethod = "Online"; break;
						default: paymentMethod = "Cash";
					}
					System.out.println("Payment Method: " + paymentMethod);
					System.out.println("Thank you for shopping with us!");
					System.out.println("Visit Again :)");
					System.out.println("==============================\n");


					// Closing time logic
					System.out.println("Enter a number to announce it's closing time:");
					int j = sc.nextInt();
					Thread.sleep(1000);

					try {
						if (j == 10)
							System.out.println("Closing Time");
						else
							System.out.println("Time to close");
					} catch (NullPointerException e) {
						System.out.println("Wait for some time, all are getting out");
					} finally {
						System.out.println("Announcing the closing time on speakers...");
					}

					Thread.sleep(2000);
					System.out.println("Enter 'clear' to close doors:");
					String door = sc.next();
					if (door.equalsIgnoreCase("clear")) {
						Thread.sleep(2000);
						System.out.println("Closing doors...");
					}

					return; // exit main loop


			}
		}
	}
}
