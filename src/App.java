import java.util.Scanner;




public class App {




    static String RESET = "\u001B[0m";
    static String RED = "\u001B[31m";
    static String GREEN = "\u001B[32m";
    static String YELLOW = "\u001B[33m";




    private static String og_input = "";
    private static String lowered_og_input = "";
    private static String type = "";
    private static String lowered_type = "";
    private static String range = "";
    private static String lowered_range = "";
    private static String rating = "";
    private static String lowered_rating = "";


    static String[] responses = {
        "Sorry, I didn't quite understand",
        "Sorry, don't really get what you're trying to say",
        "Didn't understand, could you please repeat",
        "System malfunction, can you please repeat what you said",
        "Totally didn't understand, please say that again",
        "I didn't catch that, could you clarify?",
        "Not sure what you meant, can you repeat?",
        "Could you please say that again? I'm not sure I understood",
        "I missed that, could you repeat it for me?",
        "Sorry, I don't quite get what you're trying to say, can you rephrase?",
        "Could you please clarify? I'm a bit confused",
        "What exactly do you mean? Can you say that again?",
        "I didn't follow, can you explain it again?",
        "I'm not sure I understood, could you elaborate?",
        "Can you rephrase that? I didn't quite get it",
        "Sorry, I need you to say that again, I didn't understand",
        "I didn’t get that, could you say it another way?",
        "Can you please explain that again? I’m a bit lost",
        "Sorry, I didn’t catch that, could you clarify?",
        "I didn’t understand, can you please repeat?"
    };


    static Shoe[] excercise_soccer_budget = {new Shoe("Nike Streetgato", 90.00, "excercise"), new Shoe("Samba Messi", 100.00, "excercise"), new Shoe("Nike Tiempo Legend 10 Academy", 85.00, "excercise")};
    static Shoe[] excercise_soccer_mid = {new Shoe("Nike Lunargato II", 120.00, "excercise"), new Shoe("COPA Mundial Soccer Shoes", 180.00, "excercise"), new Shoe("Manchester United Gazelle Shoes", 110.00, "excercise")};
    static Shoe[] excercise_soccer_premium = {new Shoe("Nike Phanton GX 2 Elite", 260.00, "excercise"), new Shoe("F50 Elite Soft Ground", 270.00, "excercise"), new Shoe("Nike SuperFly 9 Elite", 295.00, "excercise")};
    static Shoe[] excercise_basketball_budget = {new Shoe("Giannis Immortality 4", 85.0, "excercise"), new Shoe("Nike G.T Cut Academy", 95.00, "excercise"), new Shoe("Nike Impact 4", 95.00, "excercise")};
    static Shoe[] excercise_basketball_mid = {new Shoe("Anthony Edwards 1 Pure Ruby", 120.00, "excercise"), new Shoe("Ja 2 Nightmare", 120.00, "excercise"), new Shoe("Giannis Freak 6", 140.00, "excercise")};
    static Shoe[] excercise_basketball_premium = {new Shoe("Kobe Grinches", 785.00, "excercise"), new Shoe("Nike Lebron XXi", 225.00, "excercise"), new Shoe("Way of Wade 11", 225.00, "excercise")};
    static Shoe[] excercise_running_budget = {new Shoe("Runfalcon 3 Cloudfoam", 65.00, "excercise"), new Shoe("Nike Rival Fly 4", 100.00, "excercise"), new Shoe("Nike Jounrey Run PRM", 100.00, "excercise")};
    static Shoe[] excercise_running_mid = {new Shoe("Nike Pegasus 41", 140.00, "excercise"), new Shoe("Nike Zoom Fly 6", 170.00, "excercise"), new Shoe("Ultraboost 5X", 180.00, "excercise")};
    static Shoe[] excercise_running_premium = {new Shoe("Nike Vaporfly 3", 260.00, "excercise"), new Shoe("Nike DragonFly 2 Elite", 205.00, "excercise"), new Shoe("Nike Invincible 3", 210.00, "excercise")};
    static Shoe[] style_budget = {new Shoe("Nike Killshot", 90.00, "style"), new Shoe("Vans Authentic", 55.00, "style"), new Shoe("Vans Old Skool", 70.00, "style")};
    static Shoe[] style_mid = {new Shoe("Air Jordan 1 Mid", 125.00, "style"), new Shoe("Air Jordan 1 Low", 115.00, "style"), new Shoe("Jordan 6 Rings", 170.00, "style")};
    static Shoe[] style_premium = {new Shoe("Air Jordan 1 High", 200.00, "style"), new Shoe("SANTONI Leather Sneakers", 480.00, "style"), new Shoe("Common Projects", 400.00, "style")};
    static Shoe[] casual = {new Shoe("Sambas", 100.00, "casual"), new Shoe("Air Force 1", 115.00, "casual"), new Shoe("Nike Dunk Low", 115.00, "casual")};
    static Shoe[] luxury = {new Shoe("Air Jordan 1 Dior", 6610.00, "casual"), new Shoe("Louis Vuitton Air Force", 11000.00, "casual"), new Shoe("Carhartt Jordan 4 Retro Eminem", 40000.00, "casual")};




    public static void main(String[] args) {


       
        System.out.println("Hey there, I'm here to recommend you the best shoes possible.");
        System.out.println();
        System.out.println("We have shoes for excercising including all different kinds of sports.");
        System.out.println();
        System.out.println("We also have shoes for casual, day-to-day wear.");
        System.out.println();
        System.out.println("We also have shoes that are stylish and will keep you at the top of your game.");
        System.out.println();
        System.out.println("Also, a top secret luxury collection of sneakers that will help you certify GOAT status.");
        System.out.println();
        System.out.println("And keep in mind, we offer shoes of all different price ranges, so we assure you that you can find the right shoe for you.");
        System.out.println();
        System.out.println("We even have a secret surprise system where you will get recommended a random shoe out of our inventory.");
        System.out.println();
        System.out.println("To start off, what type of shoes are you looking for?");
        System.out.println();
     
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Are you looking for Stylish, Exercise, Casual or a surprise?");
            og_input = sc.nextLine();
            lowered_og_input = og_input.toLowerCase();




            if(lowered_og_input.contains("stylish") || lowered_og_input.contains("exercise") || lowered_og_input.contains("casual") || lowered_og_input.contains("surprise")) {
                break;
            }




            else {
                System.out.println(responses[(int) (Math.random() * 19)]);
            }
        }




        if(lowered_og_input.contains("exercise")) {
            checkExcercise();
        }




        if(lowered_og_input.contains("casual")) {
            checkCasual();
        }




        if(lowered_og_input.contains("stylish")) {
            checkStylish();
        }




        if(lowered_og_input.contains("surprise")) {
            surprise();
        }
    }


   




    public static void checkExcercise() {
        System.out.println("Excellent Choice.");
        System.out.println();
        System.out.println("We offer excercise shoes for three different sports.");
        System.out.println();
        System.out.println(RED + "Running, Basketball and Soccer." + RESET);
        System.out.println();




        while(true) {
            Scanner d = new Scanner(System.in);
            System.out.println("What sport shoe would you like?");
            type = d.nextLine();
            lowered_type = type.toLowerCase();




            if(lowered_type.contains("running") || lowered_type.contains("basketball") || lowered_type.contains("soccer")) {
                break;
            }




            else {
                System.out.println(responses[(int) (Math.random() * 19)]);
            }
        }




        if(lowered_type.contains("running")) {
            System.out.println("I see, we offer shoes in three different price ranges.");
            System.out.println();
            System.out.println("We offer premium, budget and mid-priced shoes.");
            System.out.println();
            System.out.println(YELLOW + "Premium: 200+" + RESET);
            System.out.println(YELLOW + "Mid: 100-200" + RESET);
            System.out.println(YELLOW + "Budget: <100" + RESET);
           
            while(true) {
                Scanner e = new Scanner(System.in);
                System.out.println("What priced range shoe would you like?");
                range = e.nextLine();
                lowered_range = range.toLowerCase();




                if(lowered_range.contains("mid") || lowered_range.contains("premium") || lowered_range.contains("budget")) {
                    break;
                }




                else {
                    System.out.println(responses[(int) (Math.random() * 19)]);
                }
            }




            if(lowered_range.contains("premium")) {
                System.out.println("Nice choice, I have 3 shoes for you.");
                System.out.println(RED + "The first shoe is called " + excercise_running_premium[0].getName() + " And it is a " + excercise_running_premium[0].getType() + " shoe" + RESET);
                System.out.println(GREEN + "The price of this one is $" + excercise_running_premium[0].getPrice() + RESET);
                System.out.println(RED + "The next shoe is called " + excercise_running_premium[1].getName() + " And it is a " + excercise_running_premium[1].getType() + " shoe" +RESET);
                System.out.println(GREEN + "These will cost you $" + excercise_running_premium[1].getPrice() + RESET);
                System.out.println(RED + "The last shoe that we have is called " + excercise_running_premium[2].getName() + " And it is a " + excercise_running_premium[2].getType() + " shoe" +RESET);
                System.out.println(GREEN + "These will cost $" + excercise_running_premium[2].getPrice() + RESET);




                Scanner f = new Scanner(System.in);
                System.out.println(YELLOW + "Do you have any questions? Please respond with a yes or no and I'll summarize the shoe." + RESET);
                rating = f.nextLine();
                lowered_rating = rating.toLowerCase();
               
                while (!lowered_rating.contains("yes") && !lowered_rating.contains("no")) {
                        System.out.println(responses[(int) (Math.random() * 19)]);
                        rating = f.nextLine();
                        lowered_rating = rating.toLowerCase();
                    }
                   
                if(lowered_rating.contains("yes")) {
                        System.out.println(RED + "Nike Vaporfly 3 ($260.00): The Nike Vaporfly 3 is designed for serious runners looking to enhance their speed and performance. With its lightweight construction, advanced carbon fiber plate, and responsive cushioning, this shoe delivers exceptional energy return, helping you achieve faster times. Its streamlined design offers a snug fit, while the breathable upper ensures comfort throughout long runs. Ideal for competitive athletes, the Vaporfly 3 is engineered to maximize running efficiency, making it a top choice for marathoners and speed-focused runners." + RESET);
                        System.out.println();
                        System.out.println(GREEN + "Nike DragonFly 2 Elite ($205.00): The Nike DragonFly 2 Elite is a premium track shoe built for athletes aiming to break records. Featuring a lightweight design and a specialized plate configuration for ultimate traction and speed, this shoe is tailored for sprinters and long-distance competitors alike. The DragonFly 2 Elite incorporates Flyknit technology for a flexible, sock-like fit that moves with your foot, ensuring stability during high-intensity sprints. Its advanced cushioning system supports explosive movements while reducing fatigue, making it an excellent option for elite-level runners." + RESET);
                        System.out.println();
                        System.out.println(RED + "Nike Invincible 3 ($210.00):The Nike Invincible 3 is crafted to provide superior cushioning and comfort, perfect for runners who prioritize support during long runs. With its plush, responsive ZoomX foam midsole, this shoe absorbs impact while offering a smooth and comfortable ride. The Invincible 3 features a breathable mesh upper for ventilation and an updated outsole for increased durability. Designed for runners seeking a balance of cushioning and responsiveness, this shoe is an excellent choice for those who regularly tackle long distances and want to reduce joint strain." + RESET);
                    }
   
   
                    else if(lowered_rating.contains("no")) {
                        System.out.println(RED + "Great. Enjoy your new shoes!" + RESET);
                    }
   
   
                    else {
                        System.out.println(YELLOW + responses[(int) (Math.random() * 5)] + RESET);
                    }
                }




            if(lowered_range.contains("budget")) {
                System.out.println("Nice choice, I have 3 shoes for you.");
                System.out.println(RED + "The first shoe is called " + excercise_running_budget[0].getName() + " And it is a "+ excercise_running_budget[0].getType() + " shoe" +RESET);
                System.out.println(GREEN + "The price of this one is $" + excercise_running_budget[0].getPrice());
                System.out.println(RED + "The next shoe is called " + excercise_running_budget[1].getName() + " And it is a "+ excercise_running_budget[1].getType() + " shoe" +RESET);
                System.out.println(GREEN + "These will cost you $" + excercise_running_budget[1].getPrice() + RESET);
                System.out.println(RED + "The last shoe that we have is called " + excercise_running_budget[2].getName() + " And it is a "+ excercise_running_budget[2].getType() + " shoe" +RESET);
                System.out.println(GREEN + "These will cost $" + excercise_running_budget[2].getPrice() + RESET);




                Scanner g = new Scanner(System.in);
                System.out.println(YELLOW + "Do you have any questions? Please respond with a yes or no and I'll summarize the shoe." + RESET);
                rating = g.nextLine();
                lowered_rating = rating.toLowerCase();


                while (!lowered_rating.contains("yes") && !lowered_rating.contains("no")) {
                        System.out.println(responses[(int) (Math.random() * 19)]);
                        rating = g.nextLine();
                        lowered_rating = rating.toLowerCase();
                    }
                if(lowered_rating.contains("yes")) {
                    System.out.println(RED + "Runfalcon 3 Cloudfoam ($65.00): The Runfalcon 3 Cloudfoam is a budget-friendly running shoe that offers comfort and durability for everyday runners. Its Cloudfoam midsole provides a soft and responsive cushioning, making it ideal for light to moderate runners looking for support without breaking the bank. The breathable mesh upper promotes airflow, keeping your feet cool during runs, while the sturdy rubber outsole ensures traction on various surfaces. This shoe strikes a great balance between performance and affordability, making it a solid choice for casual runners." + RESET);
                    System.out.println();
                    System.out.println(GREEN + "Nike Rival Fly 4 ($100.00): The Nike Rival Fly 4 is a reliable running shoe designed for those seeking a balance between comfort, style, and performance. With its lightweight mesh upper, it allows for breathability and flexibility while the foam midsole ensures a cushioned, responsive feel. The durable rubber outsole delivers solid grip and traction, making it suitable for a variety of running conditions. Whether you're training or just enjoying a jog, the Rival Fly 4 offers a smooth ride without compromising on quality." + RESET);
                    System.out.println();
                    System.out.println(RED + "Nike Journey Run PRM ($100.00): The Nike Journey Run PRM combines sleek design and functionality to provide a solid running experience. Equipped with a soft, cushioned midsole, this shoe offers a plush feel that supports you during every step. The lightweight mesh upper is designed for ventilation, keeping your feet cool even during longer runs. The Journey Run PRM’s rubber outsole enhances grip and durability, ensuring you can tackle different terrains with confidence, all at an affordable price point." + RESET);
                }




                else if(lowered_rating.contains("no")) {
                    System.out.println("Great. Enjoy your new shoes!");
                }




                else {
                    System.out.println(responses[(int) (Math.random() * 19)]);
                }
            }




            if(lowered_range.contains("mid")) {
                System.out.println("Nice choice, I have 3 shoes for you.");
                System.out.println(RED + "The first shoe is called " + excercise_running_mid[0].getName() + " And it is a "+ excercise_running_mid[0].getType() + " shoe" + RESET);
                System.out.println(GREEN + "The price of this one is $" + excercise_running_mid[0].getPrice() + RESET);
                System.out.println(RED + "The next shoe is called " + excercise_running_mid[1].getName() + " And it is a "+ excercise_running_mid[1].getType() + " shoe" + RESET);
                System.out.println(GREEN + "These will cost you $" + excercise_running_mid[1].getPrice() + RESET);
                System.out.println(RED + "The last shoe that we have is called " + excercise_running_mid[2].getName() + " And it is a "+ excercise_running_mid[2].getType() + " shoe" + RESET);
                System.out.println(GREEN + "These will cost $" + excercise_running_mid[2].getPrice() + RESET);
                Scanner h = new Scanner(System.in);
                System.out.println(YELLOW + "Do you have any questions? Please respond with a yes or no and I'll summarize the shoe." + RESET);
                rating = h.nextLine();
                lowered_rating = rating.toLowerCase();


                while (!lowered_rating.contains("yes") && !lowered_rating.contains("no")) {
                        System.out.println(responses[(int) (Math.random() * 19)]);
                        rating = h.nextLine();
                        lowered_rating = rating.toLowerCase();
                    }
                if(lowered_rating.contains("yes")) {
                    System.out.println(RED + "Nike Pegasus 41 ($140.00): The Nike Pegasus 41 is a versatile running shoe designed to provide a smooth and responsive ride for mid-distance runners. With its React foam midsole, the shoe delivers excellent cushioning while maintaining a lightweight feel. The engineered mesh upper enhances breathability, ensuring your feet stay cool during runs, while the durable rubber outsole provides reliable traction on a variety of surfaces. Ideal for runners seeking comfort and performance, the Pegasus 41 offers an excellent balance of support and speed." + RESET);
                    System.out.println();
                    System.out.println(GREEN + "Nike Zoom Fly 6 ($170.00): The Nike Zoom Fly 6 is built for runners who want to push the pace without sacrificing comfort. Featuring a lightweight, breathable upper and a carbon fiber-infused midsole, this shoe offers exceptional energy return with every stride. The Zoom Fly 6 also incorporates a flexible outsole, providing smooth transitions and increased speed. Whether you’re training for races or simply looking to improve your running efficiency, this shoe is designed to give you the edge you need." + RESET);
                    System.out.println();
                    System.out.println(RED + "Ultraboost 5X ($180.00): The Ultraboost 5X offers premium cushioning and an adaptive fit, making it ideal for runners who prioritize comfort and support. Its Boost midsole technology delivers a highly responsive ride, providing superior energy return with each step. The Primeknit upper wraps around your foot for a sock-like fit, enhancing flexibility and breathability. Whether you're running long distances or speed training, the Ultraboost 5X ensures a smooth and comfortable experience with every run." + RESET);
                    


                            }




                else if(lowered_rating.contains("no")) {
                    System.out.println("Great. Enjoy your new shoes!");
                }




                else {
                    System.out.println(responses[(int) (Math.random() * 19)]);
                }
            }
        }




        if(lowered_type.contains("basketball")) {
            System.out.println("Basketball, I see.");
            System.out.println();
            System.out.println("We offer these shoes in three different price ranges.");
            System.out.println();
            System.out.println("premium, budget and mid-priced shoes.");
            System.out.println();
            System.out.println(YELLOW + "Premium: 200+" + RESET);
            System.out.println(YELLOW + "Mid: 100-200" + RESET);
            System.out.println(YELLOW + "Budget: <100" + RESET);




            while(true) {
                Scanner i = new Scanner(System.in);
                System.out.println("Which priced shoe would you like?");
                range = i.nextLine();
                lowered_range = range.toLowerCase();




                if(lowered_range.contains("mid") || lowered_range.contains("premium") || lowered_range.contains("budget")) {
                    break;
                }




                else {
                    System.out.println(responses[(int) (Math.random() * 19)]);
                }
            }




            if(lowered_range.contains("premium")) {
                System.out.println("Nice choice, I have 3 shoes for you.");
                System.out.println(RED + "The first shoe is called " + excercise_basketball_premium[0].getName() + " And it is a " + excercise_basketball_premium[0].getType() + " shoe" + RESET);
                System.out.println(GREEN + "The price of this one is $" + excercise_basketball_premium[0].getPrice() + RESET);
                System.out.println(RED + "The next shoe is called " + excercise_basketball_premium[1].getName() + " And it is a " + excercise_basketball_premium[1].getType() + " shoe" + RESET);
                System.out.println(GREEN + "These will cost you $" + excercise_basketball_premium[1].getPrice() + RESET);
                System.out.println(RED + "The last shoe that we have is called " + excercise_basketball_premium[2].getName() + " And it is a " + excercise_basketball_premium[2].getType() + " shoe" + RESET);
                System.out.println(GREEN + "These will cost $" + excercise_basketball_premium[2].getPrice() + RESET);




                Scanner j = new Scanner(System.in);
                System.out.println(YELLOW + "Do you have any questions? Please respond with a yes or no and I'll summarize the shoe." + RESET);
                rating = j.nextLine();
                lowered_rating = rating.toLowerCase();


                while (!lowered_rating.contains("yes") && !lowered_rating.contains("no")) {
                        System.out.println(responses[(int) (Math.random() * 19)]);
                        rating = j.nextLine();
                        lowered_rating = rating.toLowerCase();
                    }
                if(lowered_rating.contains("yes")) {
                    System.out.println(RED + "Kobe Grinches ($785.00): The Kobe Grinches are a high-performance basketball shoe designed for players who need both speed and agility on the court. Featuring a low-top design, they offer excellent ankle mobility while the responsive Zoom Air cushioning provides a cushioned yet responsive feel. The shoe’s durable rubber outsole offers traction for quick cuts and changes of direction, while the bold green and red colorway makes a statement both on and off the court. Ideal for athletes who prioritize speed and precision, the Kobe Grinches deliver an exceptional basketball experience." + RESET);
                    System.out.println();
                    System.out.println(GREEN + "\"Nike Lebron XXi ($225.00): The Nike Lebron XXi is engineered for players who demand maximum support, cushioning, and explosiveness. Featuring a full-length Zoom Air unit for responsiveness and a multi-layered upper that enhances stability, this shoe is built to withstand intense play. The robust outsole ensures traction on both indoor and outdoor courts, while the sleek, modern design reflects Lebron James' signature style. Whether you're making fast breaks or dominating in the post, the Lebron XXi provides the performance and comfort needed for high-level basketball play." + RESET);
                    System.out.println();
                    System.out.println(RED + "The Way of Wade 11 is a high-performance basketball shoe designed in collaboration with former NBA star Dwyane Wade and the Chinese brand Li-Ning. This sleek model combines cutting-edge technology with a modern aesthetic, catering to both athletes and sneaker enthusiasts." + RESET);
                }




                else if(lowered_rating.contains("no")) {
                    System.out.println("Great. Enjoy your new shoes!");
                }




                else {
                    System.out.println(responses[(int) (Math.random() * 19)]);
                }








            }




            if(lowered_range.contains("budget")) {
                System.out.println("Nice choice, I have 3 shoes for you.");
                System.out.println(RED + "The first shoe is called " + excercise_basketball_budget[0].getName() + " And it is a "+excercise_basketball_budget[0].getType() + " shoe" + RESET);
                System.out.println(GREEN + "The price of this one is $" + excercise_basketball_budget[0].getPrice() + RESET);
                System.out.println(RED + "The next shoe is called " + excercise_basketball_budget[1].getName() + " And it is a "+excercise_basketball_budget[1].getType() + " shoe" + RESET);
                System.out.println(GREEN + "These will cost you $" + excercise_basketball_budget[1].getPrice() + RESET);
                System.out.println(RED + "The last shoe that we have is called " + excercise_basketball_budget[2].getName() + " And it is a "+excercise_basketball_budget[2].getType() + " shoe" + RESET);
                System.out.println(GREEN + "These will cost $" + excercise_basketball_budget[2].getPrice() + RESET);




                Scanner k = new Scanner(System.in);
                System.out.println(YELLOW + "Do you have any questions? Please respond with a yes or no and I'll summarize the shoe." + RESET);
                rating = k.nextLine();
                lowered_rating = rating.toLowerCase();


                while (!lowered_rating.contains("yes") && !lowered_rating.contains("no")) {
                        System.out.println(responses[(int) (Math.random() * 19)]);
                        rating = k.nextLine();
                        lowered_rating = rating.toLowerCase();
                    }
                if(lowered_rating.contains("yes")) {
                    System.out.println(RED + "Giannis Immortality 4 ($85.00): The Giannis Immortality 4 is a budget-friendly basketball shoe that combines comfort and performance on the court. With its lightweight design and responsive foam cushioning, this shoe provides a good balance of support and flexibility. The durable rubber outsole offers solid traction, while the breathable mesh upper ensures ventilation during intense games. Ideal for casual players or those looking for an affordable yet high-performing shoe, the Giannis Immortality 4 helps enhance your game without breaking the bank." + RESET);
                    System.out.println();
                    System.out.println(GREEN + "Nike G.T Cut Academy ($95.00): The Nike G.T Cut Academy is a budget-conscious basketball shoe built for quick, agile players. It features a lightweight mesh upper for breathability and flexibility, while the responsive foam midsole provides cushioning for hard landings. The shoe’s rubber outsole ensures reliable grip on the court, making it a great option for guards or players who focus on speed and mobility. With its sleek design and affordable price, the G.T Cut Academy delivers solid performance for those looking to elevate their game without spending too much." + RESET);
                    System.out.println();
                    System.out.println(RED + "Nike Impact 4 ($95.00): The Nike Impact 4 is a reliable budget basketball shoe designed for players who need dependable support and comfort during every game. Featuring a padded collar and cushioned insole, the Impact 4 offers a comfortable fit while providing impact protection. The rubber outsole is designed for optimal grip, helping you stay steady on the court. Whether you’re playing recreationally or just looking for a solid entry-level basketball shoe, the Nike Impact 4 delivers the performance you need at a budget-friendly price." + RESET);
                }




                else if(lowered_rating.contains("no")) {
                    System.out.println("Great. Enjoy your new shoes!");
                }




                else {
                    System.out.println(responses[(int) (Math.random() * 19)]);
                }
            }




            if(lowered_range.contains("mid")) {
                System.out.println("Nice choice, I have 3 shoes for you.");
                System.out.println(RED + "The first shoe is called " + excercise_basketball_mid[0].getName() + " And it is a "+excercise_basketball_mid[0].getType() + " shoe" + RESET);
                System.out.println(GREEN + "The price of this one is $" + excercise_basketball_mid[0].getPrice() + RESET);
                System.out.println(RED + "The next shoe is called " + excercise_basketball_mid[1].getName() + " And it is a "+excercise_basketball_mid[1].getType() + " shoe" + RESET);
                System.out.println(GREEN + "These will cost you $" + excercise_basketball_mid[1].getPrice() + RESET);
                System.out.println(RED + "The last shoe that we have is called " + excercise_basketball_mid[2].getName() + " And it is a "+excercise_basketball_mid[2].getType() + " shoe" + RESET);
                System.out.println(GREEN + "These will cost $" + excercise_basketball_mid[2].getPrice() + RESET);




                Scanner l = new Scanner(System.in);
                System.out.println(YELLOW + "Do you have any questions? Please respond with a yes or no and I'll summarize the shoe." + RESET);
                rating = l.nextLine();
                lowered_rating = rating.toLowerCase();


                while (!lowered_rating.contains("yes") && !lowered_rating.contains("no")) {
                        System.out.println(responses[(int) (Math.random() * 19)]);
                        rating = l.nextLine();
                        lowered_rating = rating.toLowerCase();
                    }
                if(lowered_rating.contains("yes")) {
                    System.out.println(RED + "Anthony Edwards 1 Pure Ruby ($120.00): The Anthony Edwards 1 Pure Ruby is a versatile basketball shoe that blends performance with style. Its breathable mesh upper ensures comfort and flexibility, while the foam midsole offers cushioning for all types of movements on the court. The shoe's rubber outsole provides excellent traction, making it ideal for quick cuts and sudden stops. Designed for players who need both support and responsiveness, the Anthony Edwards 1 Pure Ruby is a solid mid-tier option for those looking to up their game without going for premium prices." + RESET);
                    System.out.println();
                    System.out.println(GREEN + "Ja 2 Nightmare ($120.00): The Ja 2 Nightmare is a dynamic basketball shoe built for explosive athletes who require agility." + RESET);
                    System.out.println();
                    System.out.println(RED + "The Nike Giannis Immortality Freak 6 is the latest addiiton to the signature of NBA star Giannis Antetokounmpo. This basketball shoe is crafted to meet the needs of players who rely on power, agility, and speed , perfectly embodying Giannis's dynamic playing style." + RESET);

                }




                else if(lowered_rating.contains("no")) {
                    System.out.println("Great. Enjoy your new shoes!");
                }




                else {
                    System.out.println(responses[(int) (Math.random() * 19)]);
                }
            }
        }




        if(lowered_type.contains("soccer")) {
            System.out.println("I see, excellent choice");
            System.out.println();
            System.out.println("We offer shoes in 3 different price ranges");
            System.out.println();
            System.out.println(YELLOW + "Premium - 200+" + RESET);
            System.out.println(YELLOW + "Budget - <100" + RESET);
            System.out.println(YELLOW + "Mid - 100-200" + RESET);




            while(true) {
                Scanner m = new Scanner(System.in);
                System.out.println("Would you like a premium, budget or mid-priced shoe?");
                range = m.nextLine();
                lowered_range = range.toLowerCase();




                if(lowered_range.contains("premium") || lowered_range.contains("mid") || lowered_range.contains("budget")) {
                    break;
                }




                else {
                    System.out.println(responses[(int) (Math.random() * 19)]);
                }
            }




            if(lowered_range.contains("premium")) {
                System.out.println("Nice choice, I have 3 shoes for you.");
                System.out.println(RED + "The first shoe is called " + excercise_soccer_premium[0].getName() + " And it is a "+excercise_soccer_premium[0].getType() +" shoe"+RESET);
                System.out.println(GREEN + "The price of this one is $" + excercise_soccer_premium[0].getPrice() + RESET);
                System.out.println(RED + "The next shoe is called " + excercise_soccer_premium[1].getName() + " And it is a "+excercise_soccer_premium[1].getType() +" shoe"+RESET);
                System.out.println(GREEN + "These will cost you $" + excercise_soccer_premium[1].getPrice() + RESET);
                System.out.println(RED + "The last shoe that we have is called " + excercise_soccer_premium[2].getName() + " And it is a "+excercise_soccer_premium[0].getType() +" shoe"+RESET);
                System.out.println(GREEN + "These will cost $" + excercise_soccer_premium[2].getPrice() + RESET);




                Scanner n = new Scanner(System.in);
                System.out.println(YELLOW + "Do you have any questions? Please respond with a yes or no and I'll summarize the shoe." + RESET);
                rating = n.nextLine();
                lowered_rating = rating.toLowerCase();


                while (!lowered_rating.contains("yes") && !lowered_rating.contains("no")) {
                        System.out.println(responses[(int) (Math.random() * 19)]);
                        rating = n.nextLine();
                        lowered_rating = rating.toLowerCase();
                    }
                if(lowered_rating.contains("yes")) {
                    System.out.println(RED + "Nike Phantom GX 2 Elite ($260.00): The Nike Phantom GX 2 Elite is a top-tier soccer cleat designed for players who demand speed, precision, and control. Its lightweight construction enhances agility on the field, while the advanced stud configuration provides exceptional traction for sharp cuts and rapid acceleration. The shoe's knit upper offers a snug, sock-like fit, ensuring that the foot stays secure even during intense movements. With responsive cushioning in the sole, the Phantom GX 2 Elite provides both comfort and support for elite-level performance on the pitch." + GREEN);
                    System.out.println();
                    System.out.println(GREEN + "Nike Phantom GX 2 Elite ($260.00): The Nike Phantom GX 2 Elite is a top-tier soccer cleat designed for players who demand speed, precision, and control. Its lightweight construction enhances agility on the field, while the advanced stud configuration provides exceptional traction for sharp cuts and rapid acceleration. The shoe's knit upper offers a snug, sock-like fit, ensuring that the foot stays secure even during intense movements. With responsive cushioning in the sole, the Phantom GX 2 Elite provides both comfort and support for elite-level performance on the pitch." + RESET);
                    System.out.println();
                    System.out.println(RED + "The Nike Zoom Superfly 9 Elite is a premium soccer cleat designed for players seeking speed, precision, and exceptional touch on the ball. Engineered for elite performance, this boot offers a sleek, futuristic look combined with cutting-edge technology." + RESET);
                }




                else if(lowered_rating.contains("no")) {
                    System.out.println("Great. Enjoy your new shoes!");
                }




                else {
                    System.out.println(responses[(int) (Math.random() * 19)]);
                }
            }




            if(lowered_range.contains("budget")) {
                System.out.println("Nice choice, I have 3 shoes for you.");
                System.out.println(RED + "The first shoe is called " + excercise_soccer_budget[0].getName() +" And it is a "+excercise_soccer_budget[0].getType() +" shoe"+ RESET);
                System.out.println(GREEN + "The price of this one is $" + excercise_soccer_budget[0].getPrice() + RESET);
                System.out.println(RED + "The next shoe is called " + excercise_soccer_budget[1].getName() + " And it is a "+excercise_soccer_budget[1].getType() +" shoe"+ RESET);
                System.out.println(GREEN + "These will cost you $" + excercise_soccer_budget[1].getPrice() + RESET);
                System.out.println(RED + "The last shoe that we have is called " + excercise_soccer_budget[2].getName() + " And it is a "+excercise_soccer_budget[2].getType() +" shoe"+ RESET);
                System.out.println(GREEN + "These will cost $" + excercise_soccer_budget[2].getPrice() + RESET);




                Scanner o = new Scanner(System.in);
                System.out.println(YELLOW + "Do you have any questions? Please respond with a yes or no and I'll summarize the shoe." + RESET);
                rating = o.nextLine();
                lowered_rating = rating.toLowerCase();


                while (!lowered_rating.contains("yes") && !lowered_rating.contains("no")) {
                        System.out.println(responses[(int) (Math.random() * 19)]);
                        rating = o.nextLine();
                        lowered_rating = rating.toLowerCase();
                    }
                if(lowered_rating.contains("yes")) {
                    System.out.println(RED + "\"Nike Streetgato ($90.00): The Nike Streetgato is a budget-friendly soccer shoe designed for versatility and comfort. With its durable synthetic leather upper, it offers a secure fit and reliable touch on the ball, making it perfect for both casual and competitive players. The low-profile soleplate provides excellent traction on indoor surfaces, while the padded collar enhances comfort during extended play. Ideal for players looking for an affordable, functional option, the Nike Streetgato delivers solid performance without breaking the bank." + RESET);
                    System.out.println();
                    System.out.println(GREEN + "Samba Messi ($100.00): The Samba Messi is a great entry-level option for soccer players seeking a blend of style and performance. Inspired by the legendary Lionel Messi, this shoe features a sleek design with a soft synthetic upper that offers a comfortable fit and better control over the ball. The rubber outsole ensures reliable traction on various surfaces, including indoor and turf fields. Affordable and high-performing, the Samba Messi is an excellent choice for players looking to improve their skill." + RESET);
                    System.out.println();
                    System.out.println(RED + "The Nike Teimpo Legend 10 Aacdemy is a versatile soccer cleat that blanaces comfort, durability and performance amking it an excelling choice for players of all levels. Designed for control and precision, it carries forward the heritage of the Tiemp line while incorporating modern innovations." + RESET);

                }




                else if(lowered_rating.contains("no")) {
                    System.out.println("Great. Enjoy your new shoes!");
                }




                else {
                    System.out.println(responses[(int) (Math.random() * 19)]);
                }
            }




            if(lowered_range.contains("mid")) {
                System.out.println("Nice choice, I have 3 shoes for you.");
                System.out.println(RED + "The first shoe is called " + excercise_soccer_mid[0].getName() + " And it is a "+excercise_soccer_mid[0].getType() +" shoe"+ RESET);
                System.out.println(GREEN + "The price of this one is $" + excercise_soccer_mid[0].getPrice() + RESET);
                System.out.println(RED + "The next shoe is called " + excercise_soccer_mid[1].getName() +" And it is a "+excercise_soccer_mid[1].getType() +" shoe"+  RESET);
                System.out.println(GREEN + "These will cost you $" + excercise_soccer_mid[1].getPrice() + RESET);
                System.out.println(RED + "The last shoe that we have is called " + excercise_soccer_mid[2].getName() + " And it is a "+excercise_soccer_mid[2].getType() +" shoe"+ RESET);
                System.out.println(GREEN + "These will cost $" + excercise_soccer_mid[2].getPrice() + RESET);




                Scanner p = new Scanner(System.in);
                System.out.println(YELLOW + "Do you have any questions? Please respond with a yes or no and I'll summarize the shoe." + RESET);
                rating = p.nextLine();
                lowered_rating = rating.toLowerCase();


                while (!lowered_rating.contains("yes") && !lowered_rating.contains("no")) {
                        System.out.println(responses[(int) (Math.random() * 19)]);
                        rating = p.nextLine();
                        lowered_rating = rating.toLowerCase();
                    }
                if(lowered_rating.contains("yes")) {
                    System.out.println(RED + "Nike Lunargato II ($120.00): The Nike Lunargato II is a versatile indoor soccer shoe designed for agility and speed. Featuring a lightweight, durable upper, it offers a snug, comfortable fit that adapts to your foot for superior control on the ball. The Lunargato II has a non-marking rubber outsole that ensures exceptional traction on indoor surfaces, allowing quick turns and precise movements. Whether you're a beginner or an intermediate player, this shoe is perfect for those looking to enhance their game with a balance of comfort and performance." + RESET);
                    System.out.println();
                    System.out.println(GREEN + "COPA Mundial Soccer Shoes ($180.00): The COPA Mundial Soccer Shoes are a premium option that blends traditional design with modern performance. Known for their timeless leather construction, these shoes offer a soft, supportive fit that provides excellent touch and control on the ball. The durable outsole, designed for firm ground, offers outstanding grip and stability, making them ideal for players who want a classic feel with modern traction. A favorite among professionals and enthusiasts alike, the COPA Mundial delivers exceptional performance for serious players." + RESET);
                    System.out.println();
                    System.out.println(RED + "The Manchester United Gazelle is a stylish tribute to the iconic football club, blending the classic Gazelle silhouette with diesgn elements inspired by Manchester United's rich heritage. Perfect for fans and casual wearers alike, this shoe combines timeless aesthetics wih a nod to football history." + RESET);
                }




                else if(lowered_rating.contains("no")) {
                    System.out.println("Great. Enjoy your new shoes!");
                }




                else {
                    System.out.println(responses[(int) (Math.random() * 19)]);
                }
            }
        }}
   




    public static void checkCasual() {
        System.out.println("Casual Shoes? I see...");
        System.out.println();
        System.out.println("We have three shoes that we can recommend you");
        System.out.println();
        System.out.println(RED + "The first pair is the Adidas " + casual[0].getName() + " And it is a "+casual[0].getType() +" shoe"+ RESET);
        System.out.println(GREEN + "These will cost $" + casual[0].getPrice() + RESET);
        System.out.println(RED + "The second pair is the " + casual[1].getName() + " And it is a "+casual[1].getType() +" shoe"+  RESET);
        System.out.println(GREEN + "These will cost $" + casual[1].getPrice() + RESET);
        System.out.println(RED + "The last pair is the " + casual[2].getName() + " And it is a "+casual[2].getType() +" shoe"+ GREEN);
        System.out.println(GREEN + "These will cost $" + casual[2].getPrice() + RESET);




        Scanner q = new Scanner(System.in);
        System.out.println(YELLOW + "Do you have any questions? Please respond with a yes or no and I'll summarize the shoe." + RESET);
        rating = q.nextLine();
        lowered_rating = rating.toLowerCase();


        while (!lowered_rating.contains("yes") && !lowered_rating.contains("no")) {
                System.out.println(responses[(int) (Math.random() * 19)]);
                rating = q.nextLine();
                lowered_rating = rating.toLowerCase();
            }
        if(lowered_rating.contains("yes")) {
            System.out.println(RED + "Sambas ($100.00): The Sambas are a classic sneaker that has stood the test of time. With their sleek, retro design and leather upper, these shoes offer both style and durability. The low-profile silhouette is paired with a rubber sole, providing comfort and excellent traction for everyday wear. Originally designed as an indoor soccer shoe, the Sambas have become a popular choice for casual wear, offering versatility that pairs well with a variety of outfits. Whether you're heading to the gym or out with friends, these shoes combine function and fashion effortlessly." + RESET);
            System.out.println();
            System.out.println(GREEN + "Air Force 1 ($115.00): The Air Force 1 is a staple in the sneaker world, known for its clean design and premium leather upper. With its iconic silhouette and cushioned midsole, it offers both style and comfort. The durable rubber outsole provides excellent traction, while the air cushioning in the heel ensures a smooth ride. Perfect for casual wear or street style, the Air Force 1 has been a go-to choice for sneaker enthusiasts and fashion-forward individuals alike. Whether paired with jeans or athletic wear, this shoe delivers timeless appeal and everyday comfort." + RESET);
            System.out.println();
            System.out.println(RED + "Nike Dunk Low ($115.00): The Nike Dunk Low is a versatile sneaker that blends sport-inspired design with streetwear style. Featuring a durable leather and suede upper, this shoe offers a comfortable fit and a stylish look that pairs easily with a wide range of outfits. The cushioned sole provides comfort for all-day wear, while the rubber outsole ensures reliable traction. Whether you're running errands, meeting up with friends, or just adding a stylish touch to your casual wardrobe, the Nike Dunk Low delivers the perfect combination of comfort, performance, and style." + RESET);
        }




        else if(lowered_rating.contains("no")) {
            System.out.println("Great. Enjoy your new shoes!");
        }




        else {
            System.out.println(responses[(int) (Math.random() * 19)]);
        }
    }




    public static void checkStylish() {
        System.out.println("Looking for some style, we offer shoes in 3 different price ranges:");
        System.out.println();
        System.out.println(YELLOW + "Budget: <100" + RESET);
        System.out.println(YELLOW + "Mid: 100-200" + RESET);
        System.out.println(YELLOW + "Premium: 200+" + RESET);
        System.out.println();
        System.out.println(YELLOW + "We even offer an exclusive luxury collection." + RESET);




        while(true) {
            Scanner r = new Scanner(System.in);
            System.out.println("Would you like budget, mid, premium or luxury shoes?");
            range = r.nextLine();
            lowered_range = range.toLowerCase();




            if(lowered_range.contains("budget") || lowered_range.contains("mid") || lowered_range.contains("premium") || lowered_range.contains("luxury")) {
                break;
            }




            else {
                System.out.println(responses[(int) (Math.random() * 19)]);
            }
        }




        if(lowered_range.contains("budget")) {
            System.out.println(RED + "The first pair is " + style_budget[0].getName() + " And it is a "+style_budget[0].getType() +" shoe"+ RESET);
            System.out.println(GREEN + "These will cost $" + style_budget[0].getPrice() + RESET);
            System.out.println(RED + "The second pair is " + style_budget[1].getName() + " And it is a "+style_budget[1].getType() +" shoe"+  RESET);
            System.out.println(GREEN + "These will cost $" + style_budget[1].getPrice() + RESET);
            System.out.println(RED + "The final pair is " + style_budget[2].getName() + " And it is a "+style_budget[2].getType() +" shoe"+ RESET);
            System.out.println(GREEN + "These will cost $" + style_budget[2].getPrice() + RESET);




            Scanner s = new Scanner(System.in);
            System.out.println(YELLOW + "Do you have any questions? Please respond with a yes or no and I'll summarize the shoe." + RESET);
            rating = s.nextLine();
            lowered_rating = rating.toLowerCase();


            while (!lowered_rating.contains("yes") && !lowered_rating.contains("no")) {
                System.out.println(responses[(int) (Math.random() * 19)]);
                rating = s.nextLine();
                lowered_rating = rating.toLowerCase();
            }
            if(lowered_rating.contains("yes")) {
                System.out.println(RED + "Nike Killshot ($90.00): The Nike Killshot offers a clean, retro design that effortlessly blends casual style with athletic heritage. Its low-top silhouette features a durable leather upper and suede overlays, providing a sleek and stylish look. The cushioned insole ensures comfort, while the rubber outsole delivers reliable traction. This versatile sneaker is ideal for both everyday wear and casual outings, offering a minimalistic yet trendy aesthetic that pairs well with a variety of outfits. Whether you're heading out for the day or relaxing with friends, the Nike Killshot is a stylish and comfortable choice." + RESET);
                System.out.println();
                System.out.println(GREEN + "Vans Authentic ($55.00): The Vans Authentic is a timeless sneaker known for its simple design and laid-back vibe. Featuring a sturdy canvas upper, this shoe is lightweight and breathable, making it perfect for everyday wear. The vulcanized rubber sole provides excellent grip and durability, while the low-profile design keeps the shoe looking fresh and stylish. Available in a variety of colors, the Vans Authentic is an essential addition to any casual wardrobe, offering a versatile look that pairs well with jeans, shorts, or skirts." + RESET);
                System.out.println();
                System.out.println(RED + "Vans Old Skool ($70.00): The Vans Old Skool is a classic skate-inspired sneaker that combines style and comfort. Featuring a durable canvas and suede upper, this shoe is built to last, while the iconic side stripe adds a touch of flair. The cushioned insole offers support for all-day wear, and the vulcanized rubber outsole provides superior traction and durability. Whether you're hitting the skate park or simply enjoying a casual day out, the Vans Old Skool is a versatile and stylish option that complements a range of outfits." + RESET);

            }




            else if(lowered_rating.contains("no")) {
                System.out.println("Great. Enjoy your new shoes!");
            }




            else {
                System.out.println(responses[(int) (Math.random() * 19)]);
            }
        }




        if(lowered_range.contains("mid")) {
            System.out.println(RED + "The first pair is " + style_mid[0].getName() + " And it is a "+style_mid[0].getType() +" shoe"+ RESET);
            System.out.println(GREEN + "These will cost $" + style_mid[0].getPrice() + RESET);
            System.out.println(RED + "The second pair is " + style_mid[1].getName() + " And it is a "+style_mid[1].getType() +" shoe"+ RESET);
            System.out.println(GREEN + "These will cost $" + style_mid[1].getPrice() + RESET);
            System.out.println(RED + "The final pair is " + style_mid[2].getName() + " And it is a "+style_mid[2].getType() +" shoe"+ RESET);
            System.out.println(GREEN + "These will cost $" + style_mid[2].getPrice() + RESET);




            Scanner t = new Scanner(System.in);
            System.out.println(YELLOW + "Do you have any questions? Please respond with a yes or no and I'll summarize the shoe." + RESET);
            rating = t.nextLine();
            lowered_rating = rating.toLowerCase();


            while (!lowered_rating.contains("yes") && !lowered_rating.contains("no")) {
                System.out.println(responses[(int) (Math.random() * 19)]);
                rating = t.nextLine();
                lowered_rating = rating.toLowerCase();
            }
            if(lowered_rating.contains("yes")) {
                System.out.println(RED + "Air Jordan 1 Mid ($125.00): The Air Jordan 1 Mid is a modern take on the iconic design that made the Air Jordan 1 famous. With its premium leather upper and bold color combinations, this sneaker offers a fresh, stylish look. The Air Jordan 1 Mid features a padded collar and a cushioned midsole, ensuring comfort and support for all-day wear. Its rubber outsole provides solid traction, making it suitable for both casual wear and on-the-court performance. Whether you're a sneakerhead or simply looking for a standout piece, the Air Jordan 1 Mid delivers style and functionality." + RESET);
                System.out.println();
                System.out.println(GREEN + "Air Jordan 1 Low ($115.00): The Air Jordan 1 Low brings the legendary AJ1 design to a sleek, low-top silhouette. Crafted with a leather and synthetic upper, this shoe offers a versatile look that works with various outfits. Its cushioned insole and padded collar provide comfort and support, while the durable rubber outsole ensures reliable grip. The Air Jordan 1 Low is a perfect option for those who want the classic Jordan style with a more relaxed fit, making it ideal for casual wear or light basketball activities." + RESET);
                System.out.println();
                System.out.println(RED + "Jordan 6 Rings ($170.00): The Jordan 6 Rings is a bold, statement-making sneaker that combines elements from several iconic Air Jordan models. With a mix of premium leather, synthetic, and mesh materials, this shoe offers durability and style. The cushioned midsole provides a comfortable fit, while the rubber outsole delivers excellent traction. The Jordan 6 Rings features a sleek, athletic design that honors the legacy of Michael Jordan’s championship achievements, making it a perfect choice for sneaker enthusiasts who want a shoe with both history and performance-driven features." + GREEN);

            }




            else if(lowered_rating.contains("no")) {
                System.out.println("Great. Enjoy your new shoes!");
            }




            else {
                System.out.println(responses[(int) (Math.random() * 19)]);
            }
        }




        if(lowered_range.contains("premium")) {
            System.out.println(RED + "The first pair is " + style_premium[0].getName() + " And it is a "+style_premium[0].getType() +" shoe"+  RESET);
            System.out.println(GREEN + "These will cost $" + style_premium[0].getPrice() + RESET);
            System.out.println(RED + "The second pair is " + style_premium[1].getName() + " And it is a "+style_premium[1].getType() +" shoe"+  RESET);
            System.out.println(GREEN + "These will cost $" + style_premium[1].getPrice() + RESET);
            System.out.println(RED + "The final pair is " + style_premium[2].getName() + " And it is a "+style_premium[2].getType() +" shoe"+  RESET);
            System.out.println(GREEN + "These will cost $" + style_premium[2].getPrice() + RESET);




            Scanner u = new Scanner(System.in);
            System.out.println(YELLOW + "Do you have any questions? Please respond with a yes or no and I'll summarize the shoe.");
            rating = u.nextLine();
            lowered_rating = rating.toLowerCase();


            while (!lowered_rating.contains("yes") && !lowered_rating.contains("no")) {
                System.out.println(responses[(int) (Math.random() * 19)]);
                rating = u.nextLine();
                lowered_rating = rating.toLowerCase();
            }
            if(lowered_rating.contains("yes")) {
                System.out.println(RED + "Air Jordan 1 High ($200.00): The Air Jordan 1 High is a premium sneaker that offers a perfect blend of classic style and modern comfort. Featuring a high-top design, leather and suede upper, and the iconic Air Jordan wing logo, this shoe makes a bold statement. Its cushioned insole and padded collar provide all-day comfort, while the rubber outsole ensures excellent traction. The Air Jordan 1 High is perfect for both collectors and those looking to add a stylish, versatile sneaker to their wardrobe." + RESET);
                System.out.println();
                System.out.println(GREEN + "SANTONI Leather Sneakers ($480.00): The SANTONI Leather Sneakers are a high-end option for those who appreciate luxury craftsmanship. Made from premium leather with hand-finished details, these sneakers offer an elegant and sophisticated look. The cushioned footbed ensures a comfortable fit, while the rubber outsole provides durable traction. Whether paired with casual or semi-formal outfits, the SANTONI Leather Sneakers add a touch of refinement to any ensemble." + RESET);
                System.out.println();
                System.out.println(RED + "Common Projects ($400.00): Common Projects sneakers are known for their minimalist design and high-quality craftsmanship. Made from smooth leather with a sleek silhouette, these shoes offer understated luxury. The gold-foil stamping on the heel adds a signature touch of exclusivity. With a cushioned insole and durable rubber outsole, Common Projects sneakers provide both comfort and style, making them a perfect choice for those who value sophistication and attention to detail." + RESET);

            }




            else if(lowered_rating.contains("no")) {
                System.out.println("Great. Enjoy your new shoes!");
            }




            else {
                System.out.println(responses[(int) (Math.random() * 19)]);
            }
        }




        if(lowered_range.contains("luxury")) {
            System.out.println(RED + "The first pair is " + luxury[0].getName() + " And it is a "+luxury[0].getType() +" shoe"+  RESET);
            System.out.println(GREEN + "These will cost $" + luxury[0].getPrice() + RESET);
            System.out.println(RED + "The second pair is " + luxury[1].getName() + " And it is a "+luxury[1].getType() +" shoe"+  RESET);
            System.out.println(GREEN + "These will cost $" + luxury[1].getPrice() + RESET);
            System.out.println(RED + "The final pair is " + luxury[2].getName() + " And it is a "+luxury[2].getType() +" shoe"+  RESET);
            System.out.println(GREEN + "These will cost $" + luxury[2].getPrice() + RESET);




            Scanner v = new Scanner(System.in);
            System.out.println(YELLOW + "Do you have any questions? Please respond with a yes or no and I'll summarize the shoe." + RESET);
            rating = v.nextLine();
            lowered_rating = rating.toLowerCase();


            while (!lowered_rating.contains("yes") && !lowered_rating.contains("no")) {
                System.out.println(responses[(int) (Math.random() * 19)]);
                rating = v.nextLine();
                lowered_rating = rating.toLowerCase();
            }
            if(lowered_rating.contains("yes")) {
                System.out.println(RED + "Air Jordan 1 Dior ($6610.00): The Air Jordan 1 Dior is the epitome of luxury and exclusivity. This limited-edition collaboration between Jordan and Dior features premium materials, including high-quality leather and suede, combined with Dior’s signature craftsmanship. The sneaker showcases a unique design, with the iconic Jordan silhouette accented by Dior’s distinct logo. Its plush interior and high-end construction offer both comfort and style. Perfect for sneaker enthusiasts and fashion aficionados, the Air Jordan 1 Dior is a collector's item and a statement piece in any wardrobe. " + RESET);
                System.out.println();
                System.out.println(GREEN + "Louis Vuitton Air Force ($11000.00): The Louis Vuitton Air Force is a luxurious reinterpretation of the classic Air Force 1, created in collaboration with the prestigious fashion house. Made from premium leather, the shoe features Louis Vuitton's iconic monogram print and distinctive design details, such as gold hardware and embossed branding. Its refined aesthetic is matched by exceptional comfort, thanks to a cushioned insole and high-quality construction. The Louis Vuitton Air Force is a true symbol of high-end fashion and sneaker culture, perfect for those who want to stand out in style." + RESET);
                System.out.println();
                System.out.println(RED + "Carhartt Jordan 4 Retro Eminem ($40000.00): The Carhartt Jordan 4 Retro Eminem is one of the most exclusive and sought-after sneakers in the world, combining the rugged appeal of Carhartt workwear with the iconic \r\n" + //
                                        "Jordan 4 silhouette. With only a limited number of pairs produced, this shoe is a rare collector’s item. The design features premium materials such as durable suede and reflective accents, with Eminem’s signature touches. As part of a special collaboration, the Carhartt Jordan 4 Retro Eminem offers both unparalleled style and exclusivity, making it a must-have for collectors and sneakerheads alike.\r\n" + //
                                        "" + RESET);
            }




            else if(lowered_rating.contains("no")) {
                System.out.println("Great. Enjoy your new shoes!");
            }




            else {
                System.out.println(responses[(int) (Math.random() * 19)]);
            }
        }
    }




    public static void surprise() {
        System.out.println("I see you have come for a surprise...");
        System.out.println();
        System.out.println("We will randomly recommend you any shoe of a type you choose");
        System.out.println();
        System.out.println("First tell us the type");
       
        while(true) {
            Scanner ab = new Scanner(System.in);
            System.out.println("Would you like a random stylish, casual, or excercise shoe");
            type = ab.nextLine();
            lowered_type = type.toLowerCase();




            if(lowered_type.contains("stylish") || lowered_type.contains("casual") || lowered_type.contains("excercise")) {
                break;
            }




            else {
                System.out.println(responses[(int) (Math.random() * 19)]);
            }
        }




        if(lowered_type.contains("excercise")) {
            System.out.println(RED + "The shoe you get is................." + RESET);
            System.out.println(GREEN + excercise_basketball_premium[(int) (Math.random() * 3)].getName() + RESET);
        }




        if(lowered_type.contains("casual")) {
            System.out.println(RED + "The shoe you get is.............." + RESET);
            System.out.println(GREEN + casual[(int) (Math.random() * 3)].getName() + RESET);
        }




        if(lowered_type.contains("stylish")) {
            System.out.println("The shoe you get is...........");
            System.out.println(GREEN + style_premium[(int) (Math.random() * 3)].getName() + RESET);
        }
    }




}