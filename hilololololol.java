import java.util.*;

public class hilololololol
{

    private static int score=0;                   

    public static void main ()
    {
        System.out.println("Earth is on the verge of destruction. YOU are the only person who can save us. Accumulate enough points to save the world by correctly choosing whether or not to recycle the following things.");
        System.out.println(" Correctly identifying whether you should recycle or not will give you 10 points. Getting it wrong will deduct 5 points. ");
        System.out.println("You need 75 points to win");
        itemYes("gatorade bottle","Gatorade plastic containers are recyclable (PET #1 polyethylene terephthalate); plastic caps are recyclable and are made of polypropylene (# 5 type plastic).");
        itemNo("reusable water bottle","They are reusable, so just wash it and use it again, you don't have to recycle it.");
        itemYes("copy paper", "This needs to be recycled. It is especially important because so much paper is wasted everyday, and trees are cut down every day to account for all the paper needed in businesses");
        itemYes(" Batteries","When batteries are discarded they become “hazardous waste,” and in California those products are barred from landfills. This rule applies to batteries of all sizes (AAA, AA, C, D, button cell, 9 volt, etc.), both rechargeable and single-use. Used batteries can be taken to a household hazardous waste disposal facility, an authorized recycling facility, or a universal waste handler for proper disposal. ");
        itemNo(" plastic grocery bags"," Though they are made of plastic they cannot be recycled. Try using cloth crocery bags!");
        itemNo(" Styrafoam cups", "Styrofoam cannot be recycled and it does not biodegrade. Try limiting your use of Styrofoam coffee cups, food containers and packing peanuts.");
        itemYes("grass","rasscycling, the natural recycling of grass by leaving clippings on the lawn when mowing, allows cut grass to quickly decompose, returning valuable nutrients to the soil. Grasscycling saves time and money, protects the environment, and, by adding beneficial organic matter to the soil, provides free fertilizer to produce healthy, green lawns.");
        itemNo("shredded paper", "While paper is often recyclable, shredded paper can be a problem for recycling facilities since it is difficult to sort. Instead, use it as mulch.");
        itemYes("food scraps","Organic material like food waste and yard waste represents about one-third of the solid waste sent to landfills, even though a large percentage can be recycled or composted.");
        itemYes("Metal","Most metal containers found around the home or workplace can be recycled. Beverage containers and many canned goods containers are manufactured of aluminum and are easy to recycle. Steel food cans, and even empty aerosol containers, are recyclable, too. Clean aluminum food packaging--pie tins, frozen dinner trays, sheets of foil--can be added to recycling bins.");
        if(score>=75){
            System.out.println("WOW! Thank you for saving the world. Now continue recycling through your daily life to keep earth out of trouble");
        }
        else{
            System.out.println("BOOM! KRAKAAAA! The World has exploded :(( Would you like to try again? y/n");
            Scanner sc=new Scanner(System.in);
            String x=sc.nextLine();
            if(x.equals("y")) main();
            else{
                System.out.println("Aww well all humans are dead now");
            }
        }
    }

    public static void itemYes(String item,String whyYes){
        System.out.println(item+"? y/n");
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        if(x.equals("y")){
            score+=10;
            System.out.println( "correct!"+ whyYes);
            System.out.println("Your score is now "+score);

        }
        else{
            score-=5;
            System.out.println("Sorry... you're wrong! You're score is now "+score);
        }
    }

    public static void itemNo(String item,String whyNo){
        System.out.println(item+"? y/n");
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        if(x.equals("n")){
            score+=10;
            System.out.println( "correct! "+ whyNo);
            System.out.println("Your score is now "+score);

        }
        else{
            score-=5;
            System.out.println("Sorry... you're wrong! You're score is now "+score);
        }

    }
}
