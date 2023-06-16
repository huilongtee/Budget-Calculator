public class budgetCalculator {

    private int age;
    private String maritalStatus;
    private int childrenNo;
    private String carOwnershipStatus;
    private int budget = 0;
    private int monthlyIncome = 0;
    private double shortTermSaving = 0;
    private double mediumTermSaving = 0;
    private double longTermSaving = 0;
    private double wants = 0;
    private double needs = 0;

    public budgetCalculator(int age, String maritalStatus, int childrenNo, String carOwnershipStatus) {

        this.age = age;
        this.maritalStatus = maritalStatus;
        this.childrenNo = childrenNo;
        this.carOwnershipStatus = carOwnershipStatus;

    }

    public budgetCalculator() {
    }

    public void calculateBudget() {
        if (maritalStatus.equalsIgnoreCase("single") && carOwnershipStatus.equalsIgnoreCase("public transport user")) {
            this.setBudget(1760);
        } else if (maritalStatus.equalsIgnoreCase("single") && carOwnershipStatus.equalsIgnoreCase("car owner")) {
            this.setBudget(2290);
        } else if (maritalStatus.equalsIgnoreCase("married") && childrenNo == 0) {
            this.setBudget(4110);
        } else if (maritalStatus.equalsIgnoreCase("married") && childrenNo == 1) {
            this.setBudget(5360);
        } else if (maritalStatus.equalsIgnoreCase("married") && childrenNo == 2) {
            this.setBudget(6100);
        } else if (maritalStatus.equalsIgnoreCase("single") && age >= 60) {
            this.setBudget(2330);
        } else if (maritalStatus.equalsIgnoreCase("married") && age >= 60) {
            this.setBudget(3020);
        } else if (maritalStatus.equalsIgnoreCase("single") && childrenNo == 1) {
            this.setBudget(4200);
        } else if (maritalStatus.equalsIgnoreCase("single") && childrenNo == 2) {
            this.setBudget(4940);
        }

        System.out.println("\nThe suggested expenses budget for Johor Bahru is: RM" + this.getBudget() + "\n");

    }

    public void calculateSavingBudget(int monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
        shortTermSaving = monthlyIncome * 0.1;
        mediumTermSaving = monthlyIncome * 0.1;
        longTermSaving = monthlyIncome * 0.1;
        wants = monthlyIncome * 0.25;
        needs = monthlyIncome * 0.45;
    }

    public void comparison() {

        if ((wants + needs) > this.getBudget()) {

            System.out.println("Your monthly expenses is higher than the budget");
        } else {
            System.out.println("Your monthly expenses is within the budget");

        }
    }

    public void setMonthlyIncome(int monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public void setLongTermSaving(double longTermSaving) {
        this.longTermSaving = longTermSaving;
    }

    public void setMediumTermSaving(double mediumTermSaving) {
        this.mediumTermSaving = mediumTermSaving;
    }

    public void setNeeds(double needs) {
        this.needs = needs;
    }

    public void setShortTermSaving(double shortTermSaving) {
        this.shortTermSaving = shortTermSaving;
    }

    public void setWants(double wants) {
        this.wants = wants;
    }

    public double getLongTermSaving() {
        return longTermSaving;
    }

    public double getMediumTermSaving() {
        return mediumTermSaving;
    }

    public double getNeeds() {
        return needs;
    }

    public double getShortTermSaving() {
        return shortTermSaving;
    }

    public double getWants() {
        return wants;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }


    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCarOwnershipStatus(String carOwnershipStatus) {
        this.carOwnershipStatus = carOwnershipStatus;
    }

    public void setChildrenNo(int childrenNo) {
        this.childrenNo = childrenNo;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getAge() {
        return age;
    }

    public int getChildrenNo() {
        return childrenNo;
    }

    public String getCarOwnershipStatus() {
        return carOwnershipStatus;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }


}
