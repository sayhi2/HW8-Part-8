public class Main {
    public static void main(String[] args) {
        var totalWorkingHours = 640;
        var oneWorkerHours = 8;
        var totalCompanyWorkers = totalWorkingHours / oneWorkerHours;
        System.out.println("Всего работников в компании " + totalCompanyWorkers + " человек ");
        var additionalWorkers = 94;
        var totalWorkers = totalCompanyWorkers + additionalWorkers;
        System.out.println("Все работники " + totalWorkers + " человек ");
        var newTotalWorkingHours = totalWorkers * oneWorkerHours;
        System.out.println("Если в компании работает " + totalWorkers + " человека,то всего " + newTotalWorkingHours + " часов работы может быть поделено между сотрудниками ");
    }
}