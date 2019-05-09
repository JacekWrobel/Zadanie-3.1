public class RoomThing {
    public static void main (String [] args){
    Thing thing1 = new Thing();
    thing1.name = "Zegar";
    thing1.colour = "biały";
    thing1.isBroken = true;
    System.out.println("W moim prokoju jest np. " +thing1.name
     +", jego kolor jest " +thing1.colour +" i jest " +thing1.isBroken +", że jest zepsuty.");

    Thing thing2 = new Thing();
    thing2.name = "Wieszak";
    thing2.colour = "czarny";
    thing2.isBroken = false;

    System.out.println("W moim prokoju jest np. " +thing2.name
    +", jego kolor jest " +thing2.colour +" i jest " +thing2.isBroken +", że jest zepsuty.");
    }
}
