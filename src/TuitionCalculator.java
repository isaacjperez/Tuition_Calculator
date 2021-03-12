import javax.swing.*;
import java.awt.*;
import java.awt.desktop.OpenURIEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class TuitionCalculator extends JFrame implements ActionListener {


    private JTextArea outputArea;
    private JButton calcButton;
    private JFormattedTextField costPerCreditHourField;
    private JFormattedTextField monthsInASemesterField;
    private JFormattedTextField fullTimeHoursField;
    private JFormattedTextField partTimeHoursField;
    private JFormattedTextField bookCostPerSemField;
    private JFormattedTextField roomAndBoardPerMonthField;
    private JFormattedTextField foodCostPerMonthField;
    private JFormattedTextField travelCostPerMonthField;
    private JFormattedTextField semestersInAYearField;
    private JFormattedTextField hoursInADegreeField;

    TuitionCalculator(){ //constructor
        JLabel WelcomeLabel;
        JLabel costPerCreditHourLabel;
        JLabel monthsInASemesterLabel;
        JLabel fullTimeHoursLabel;
        JLabel partTimeHoursLabel;
        JLabel bookCostPerSemLabel;
        JLabel roomAndBoardPerMonthLabel;
        JLabel foodCostPerMonthLabel;
        JLabel travelCostPerMonthLabel;
        JLabel semestersInAYearLabel;
        JLabel hoursInADegreeLabel;

        GridBagConstraints layoutConst;
        JScrollPane scrollPane;

        //format for the cost fields
        NumberFormat currencyFormat;

        //format for the months
        NumberFormat integerFormat;

        setTitle("Tuition Calculator");

        //create labels
        WelcomeLabel = new JLabel("\t\tPlease Enter Your Rates");
        costPerCreditHourLabel = new JLabel("Cost Per Credit Hour:");
        monthsInASemesterLabel = new JLabel("Months In A Semester:");
        fullTimeHoursLabel = new JLabel("Full Time Hours:");
        partTimeHoursLabel = new JLabel("Part Time Hours:");
        bookCostPerSemLabel = new JLabel("Book Cost Per Semester:");
        roomAndBoardPerMonthLabel = new JLabel("Room and Board Per Month:");
        foodCostPerMonthLabel = new JLabel("Food Cost Per Month:");
        travelCostPerMonthLabel = new JLabel("Travel Cost Per Month:");
        semestersInAYearLabel = new JLabel("Semesters In A Year:");
        hoursInADegreeLabel = new JLabel("Hours in A Degree:");

        // Create output area and add it to scroll pane
        outputArea = new JTextArea(15,15);
        scrollPane = new JScrollPane(outputArea);
        outputArea.setEditable(false);

        //create button
        calcButton = new JButton("Calculate");
        calcButton.addActionListener(this);


        //specify number format
        currencyFormat = NumberFormat.getCurrencyInstance();
        integerFormat = NumberFormat.getIntegerInstance();

        //create text fields to go next to labels
        costPerCreditHourField = new JFormattedTextField(currencyFormat);
        costPerCreditHourField.setEditable(true);
        costPerCreditHourField.setColumns(10);
        costPerCreditHourField.setValue(500);

        monthsInASemesterField = new JFormattedTextField(integerFormat);
        monthsInASemesterField.setEditable(true);
        monthsInASemesterField.setColumns(10);
        monthsInASemesterField.setValue(4);

        fullTimeHoursField = new JFormattedTextField(integerFormat);
        fullTimeHoursField.setEditable(true);
        fullTimeHoursField.setColumns(10);
        fullTimeHoursField.setValue(15);

        partTimeHoursField = new JFormattedTextField(integerFormat);
        partTimeHoursField.setEditable(true);
        partTimeHoursField.setColumns(10);
        partTimeHoursField.setValue(9);

        bookCostPerSemField = new JFormattedTextField(currencyFormat);
        bookCostPerSemField.setEditable(true);
        bookCostPerSemField.setColumns(10);
        bookCostPerSemField.setValue(1000);

        roomAndBoardPerMonthField = new JFormattedTextField(currencyFormat);
        roomAndBoardPerMonthField.setEditable(true);
        roomAndBoardPerMonthField.setColumns(10);
        roomAndBoardPerMonthField.setValue(800);

        foodCostPerMonthField = new JFormattedTextField(currencyFormat);
        foodCostPerMonthField.setEditable(true);
        foodCostPerMonthField.setColumns(10);
        foodCostPerMonthField.setValue(300);

        travelCostPerMonthField = new JFormattedTextField(currencyFormat);
        travelCostPerMonthField.setEditable(true);
        travelCostPerMonthField.setColumns(10);
        travelCostPerMonthField.setValue(75);

        semestersInAYearField = new JFormattedTextField(integerFormat);
        semestersInAYearField.setEditable(true);
        semestersInAYearField.setColumns(10);
        semestersInAYearField.setValue(2);

        hoursInADegreeField = new JFormattedTextField(integerFormat);
        hoursInADegreeField.setEditable(true);
        hoursInADegreeField.setColumns(10);
        hoursInADegreeField.setValue(120);


        // Use a GridBagLayout
        setLayout(new GridBagLayout());

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10,10,5,10);
        layoutConst.anchor = GridBagConstraints.LINE_END;
        layoutConst.gridx = 0;
        layoutConst.gridy = 0;
        add(WelcomeLabel, layoutConst);

        layoutConst= new GridBagConstraints();
        layoutConst.insets = new Insets(10,10,1,1);
        layoutConst.anchor = GridBagConstraints.LINE_END;
        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        add(costPerCreditHourLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10,1,1,5);
        layoutConst.fill = GridBagConstraints.HORIZONTAL;
        layoutConst.gridx = 1;
        layoutConst.gridy = 1;
        add(costPerCreditHourField, layoutConst);
//
        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10,5,1,1);
        layoutConst.anchor = GridBagConstraints.LINE_END;
        layoutConst.gridx = 2;
        layoutConst.gridy = 1;
        add(monthsInASemesterLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10,1,1,10);
        layoutConst.fill = GridBagConstraints.HORIZONTAL;
        layoutConst.gridx = 3;
        layoutConst.gridy = 1;
        add(monthsInASemesterField, layoutConst);
//
        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(5,10,5,1);
        layoutConst.anchor = GridBagConstraints.LINE_END;
        layoutConst.gridx = 0;
        layoutConst.gridy = 2;
        add(roomAndBoardPerMonthLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(1, 1,1,10);
        layoutConst.fill = GridBagConstraints.HORIZONTAL;
        layoutConst.gridx = 1;
        layoutConst.gridy = 2;
        add(roomAndBoardPerMonthField, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(1,5,1,1);
        layoutConst.anchor = GridBagConstraints.LINE_END;
        layoutConst.gridx = 2;
        layoutConst.gridy = 2;
        add(fullTimeHoursLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(1,1,1,10);
        layoutConst.fill = GridBagConstraints.HORIZONTAL;
        layoutConst.gridx = 3;
        layoutConst.gridy = 2;
        add(fullTimeHoursField, layoutConst);
//
        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(1, 10,1,1);
        layoutConst.anchor = GridBagConstraints.LINE_END;
        layoutConst.gridx = 0;
        layoutConst.gridy = 3;
        add(bookCostPerSemLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(1, 1,1,10);
        layoutConst.fill = GridBagConstraints.HORIZONTAL;
        layoutConst.gridx = 1;
        layoutConst.gridy = 3;
        add(bookCostPerSemField, layoutConst);
//
        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(1, 5,1,1);
        layoutConst.anchor = GridBagConstraints.LINE_END;
        layoutConst.gridx = 2;
        layoutConst.gridy = 3;
        add(partTimeHoursLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(1, 1,1,10);
        layoutConst.fill = GridBagConstraints.HORIZONTAL;
        layoutConst.gridx = 3;
        layoutConst.gridy = 3;
        add(partTimeHoursField, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(1,10,1,1);
        layoutConst.anchor = GridBagConstraints.LINE_END;
        layoutConst.gridx = 0;
        layoutConst.gridy = 4;
        add(foodCostPerMonthLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(1, 1,1,10);
        layoutConst.fill = GridBagConstraints.HORIZONTAL;
        layoutConst.gridx = 1;
        layoutConst.gridy = 4;
        add(foodCostPerMonthField, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(1,5,1,1);
        layoutConst.anchor = GridBagConstraints.LINE_END;
        layoutConst.gridx = 2;
        layoutConst.gridy = 4;
        add(semestersInAYearLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(1, 1,1,10);
        layoutConst.fill = GridBagConstraints.HORIZONTAL;
        layoutConst.gridx = 3;
        layoutConst.gridy = 4;
        add(semestersInAYearField, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(1,10,1,1);
        layoutConst.anchor = GridBagConstraints.LINE_END;
        layoutConst.gridx = 0;
        layoutConst.gridy = 5;
        add(travelCostPerMonthLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(1, 1,1,10);
        layoutConst.fill = GridBagConstraints.HORIZONTAL;
        layoutConst.gridx = 1;
        layoutConst.gridy = 5;
        add(travelCostPerMonthField, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(1,5,10,1);
        layoutConst.anchor = GridBagConstraints.LINE_END;
        layoutConst.gridx = 2;
        layoutConst.gridy = 5;
        add(hoursInADegreeLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(1, 1,10,10);
        layoutConst.fill = GridBagConstraints.HORIZONTAL;
        layoutConst.gridx = 3;
        layoutConst.gridy = 5;
        add(hoursInADegreeField, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(1,10,10,10);
        layoutConst.fill = GridBagConstraints.BOTH;
        layoutConst.gridx = 3;
        layoutConst.gridy = 6;
        add(calcButton, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(1,5,10,5);
        layoutConst.fill = GridBagConstraints.HORIZONTAL;
        layoutConst.gridx = 0;
        layoutConst.gridy = 7;
        layoutConst.gridwidth = 4;
        //layoutConst.gridheight = 4;
        add(scrollPane, layoutConst);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // Get values from fields
        double costPerCreditHour = ((Number) costPerCreditHourField.getValue()).doubleValue();
        double bookCostPerSemester = ((Number) bookCostPerSemField.getValue()).doubleValue();
        double roomAndBoardCost = ((Number) roomAndBoardPerMonthField.getValue()).doubleValue();
        double foodCostPerMonth = ((Number) foodCostPerMonthField.getValue()).doubleValue();
        double travelCostPerMonth = ((Number) travelCostPerMonthField.getValue()).doubleValue();

        int monthsInASemester = ((Number) monthsInASemesterField.getValue()).intValue();
        int fullTimeHours = ((Number) fullTimeHoursField.getValue()).intValue();
        int partTimeHours = ((Number) partTimeHoursField.getValue()).intValue();
        int semestersInAYear = ((Number) semestersInAYearField.getValue()).intValue();
        int hoursInADegree = ((Number) hoursInADegreeField.getValue()).intValue();

        double fullTimeTuition = fullTimeHours * costPerCreditHour;
        double partTimeTuition = partTimeHours * costPerCreditHour;
        double roomAndBoard = roomAndBoardCost * monthsInASemester;
        double travel = travelCostPerMonth * monthsInASemester;
        double food = foodCostPerMonth * monthsInASemester;
        double fullTimeTotal = 0;
        double partTimeTotal = 0;
        partTimeTotal += partTimeTuition + roomAndBoard + travel + food;
        fullTimeTotal += fullTimeTuition + roomAndBoard + travel + food;

        //clear the output area
        outputArea.setText("");

        outputArea.append("FULL TIME COST PER SEMESTER"+"\t" +"PART TIME COST PER SEMESTER\n");
        outputArea.append("TUITION: $" + fullTimeTuition +"\t\t" + "TUITION: $" + partTimeTuition +"\n");
        outputArea.append("ROOM AND BOARD: $" + roomAndBoard + "\t\t" + "ROOM AND BOARD: $" + roomAndBoard + "\n");
        outputArea.append("TRAVEL: $" + travel + "\t\t" + "TRAVEL: $" + travel + "\n");
        outputArea.append("FOOD: $" + food + "\t\t" + "FOOD: $" + food + "\n");
        outputArea.append("BOOKS: $" + bookCostPerSemester + "\t\t" + "BOOKS: $" + bookCostPerSemester + "\n");
        outputArea.append("TOTAL COST: $" + fullTimeTotal + "\t\t" + "TOTAL COST: $" + partTimeTotal + "\n");
        outputArea.append("\nTIME COST PER DEGREE\n");
        outputArea.append("TIME FOR " + hoursInADegree + " HRS @ FULL TIME: " + (double)(hoursInADegree / fullTimeHours) + " SEMESTERS\n");
        outputArea.append("TIME FOR " + hoursInADegree + " HRS @ FULL TIME: " + ((double)(hoursInADegree / fullTimeHours)) / semestersInAYear + " YEARS\n");
        outputArea.append("TIME FOR " + hoursInADegree + " HRS @ PART TIME: " + (double)(hoursInADegree / partTimeHours) + " SEMESTERS\n");
        outputArea.append("TIME FOR " + hoursInADegree + " HRS @ PART TIME: " + ((double)(hoursInADegree / partTimeHours)) / semestersInAYear + " YEARS\n");


    }

    public static void main(String[] args) {
        TuitionCalculator myFrame = new TuitionCalculator();

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}
