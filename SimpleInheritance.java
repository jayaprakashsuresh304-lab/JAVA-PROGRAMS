import java.util.Scanner;
class FamilyMember {
    String role;
    String name;
    FamilyMember(String role, String name) {
        this.role = role;
        this.name = name;
    }
    void display() {
        System.out.println(role + ": " + name);
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] roles = {"Grandfather", "Grandmother", "Father", "Mother", "Me"};
        FamilyMember[] members = new FamilyMember[roles.length];
        for (int i = 0; i < roles.length; i++) {
            System.out.print("Enter " + roles[i] + "'s name: ");
            String name = sc.nextLine();
            members[i] = new FamilyMember(roles[i], name);
        }
        System.out.println("\n--- Family Members ---");
        for (FamilyMember member : members) {
            member.display();
        }
        sc.close();
    }
}
