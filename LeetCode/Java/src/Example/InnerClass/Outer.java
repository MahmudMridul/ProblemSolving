package Example.InnerClass;

public class Outer {
    private final String privateOuterValue = "Private Outer";
    private static final String privateStaticOuterValue = "Private Static Outer Value";
    public final String publicOuterValue = "Public Outer";
    public static final String publicStaticOuterValue = "Public Static Outer Value";

    public class PublicInnerClass {
        private final String privateInnerValue = "Private Inner";
        public final String publicInnerValue = "Public Inner";

        public void innerFunction() {
            System.out.println("From\nPublicInnerClass");
            //Can access private and public members of outer class
            System.out.println(privateOuterValue);
            System.out.println(publicOuterValue);

        }
    }

    private class PrivateInnerClass {
        private final String privateInnerValue = "Private Inner";
        public final String publicInnerValue = "Public Inner";

        public void innerFunction() {
            //Can access private and public members of outer class
            System.out.println(privateOuterValue);
            System.out.println(publicOuterValue);

        }
    }

    public static class PublicStaticInnerClass {
        private final String privateInnerValue = "Private Inner";
        public final String publicInnerValue = "Public Inner";

        public void innerFunction() {
            //Can access private and public members of outer class
//            System.out.println(privateOuterValue);
//            System.out.println(publicOuterValue);

        }
    }

    private static class PrivateStaticInnerClass {
        private final String privateInnerValue = "Private Inner";
        public final String publicInnerValue = "Public Inner";

        public void innerFunction() {
            //Can access private and public members of outer class
//            System.out.println(privateOuterValue);
//            System.out.println(publicOuterValue);

        }
    }


    public void outerFunction() {
        PublicInnerClass publicInnerClass = new PublicInnerClass();
        publicInnerClass.innerFunction();
    }
}
