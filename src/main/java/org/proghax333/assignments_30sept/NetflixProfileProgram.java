package org.proghax333.assignments_30sept;

class NetflixProfile {
    public void watch() {
        System.out.println("All kind of content can be watched.");
    }
}

class KidsProfile extends NetflixProfile {
    public void watch() {
        System.out.println("Only cartoons are available here.");
    }
}

public class NetflixProfileProgram {
    public static void main(String[] args) {
        NetflixProfile netflixProfile = new NetflixProfile();
        netflixProfile.watch();

        KidsProfile kidsProfile = new KidsProfile();
        kidsProfile.watch();
    }
}
