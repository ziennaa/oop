# oop
1. Public Classes Must Be Accessible from Other Files
A public class is meant to be accessible outside its package.
Since Java organizes code into files and packages, it needs a strict mapping between file names and public class names so that the Java compiler and JVM can locate the correct class.
2. Java's Compilation and Class Naming Rules
When you compile a Java file, the compiler generates a .class file with the same name as the class.
If a public class were allowed to have a different filename, there would be confusion about which .class file represents the main class, breaking Java's predictable structure.
3. Non-Public Classes Don't Need Global Accessibility
A non-public class is only accessible within the same package.
Since it's not intended for external access, Java does not require its filename to match.
This allows you to define multiple non-public classes in a single file without worrying about filename constraints.
