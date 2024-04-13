package library;

public class Library {
    private Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        double longestRentTime = rents[0].getEnd().getTime() - rents[0].getBegin().getTime();
        int longestRentIdx = 0;
        for (int i = 1; i < rents.length; i++) {
            if ((rents[i].getEnd().getTime() - rents[i].getBegin().getTime() > longestRentTime)) {
                longestRentTime = rents[i].getEnd().getTime() - rents[i].getBegin().getTime();
                longestRentIdx = i;
            }
        }
        return rents[longestRentIdx];
    }
}
