public class ProjectClassTest {
    public static void main(String[] args) {
        Project projOne = new Project();
        projOne.setName("Money");
        projOne.setDescription("Make alot of money");
        System.out.println(projOne.elevatorPitch());
        Project projTwo = new Project("Dance");
        projTwo.setDescription("Dance all Day");
        System.out.println(projTwo.getDescription()); 
    }
}