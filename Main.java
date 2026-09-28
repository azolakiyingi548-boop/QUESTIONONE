//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String [] city = {"Cape Town", "Port Elizabeth", "Pretoria"};
    String [] electronicFranchise = {"PS5", "XBOX", "SWITCH"};
    int [][] sales = {{1000, 2000, 3000}, {2000, 3000, 4000}, {1500, 1100, 1200}};

    System.out.println("------------------------------------------------------------------");
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("------------------------------------------------------------------");
    System.out.printf("%-20s", "");
    for(String franchise: electronicFranchise){
        System.out.printf("%-18s", franchise);
    }
    System.out.println();

    for(int i = 0; i < city.length; i++){
        System.out.printf("%-19s", city[i]);
        for(int j = 0; j < sales[i].length; j++){
            System.out.printf("%-20d", sales[i][j]);
        }
        System.out.println();
    }
    System.out.println("--------------------------------------------------------------------");
    System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
    System.out.println("--------------------------------------------------------------------");

    int mostSales = -1;
    String cityWithMostSales = "";
    for(int i = 0; i< city.length; i++){
        int totalSales = 0;
        for(int j = 0; j < sales[i].length; j++){
            totalSales += sales[i][j];

            if(totalSales > mostSales){
                mostSales = totalSales;
            }
        }
        System.out.printf("%-16s %-10d %n", city[i], totalSales);
    }
    System.out.println("\nCITY WITH THE MOST SALES: " + cityWithMostSales);
    }

