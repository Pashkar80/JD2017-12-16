package by.it.karpeichyk.jd02_04.Calc;

class Patterns {

    // регулярки, приведены для сокращения времени.
    // будет полезно составить свои варианты
    static final String SCALAR="((-?)([0-9.])+)";                       //числа
    static final String VECTOR="\\{((-?([0-9.])+),?)+}";                //вектора
    static final String MATRIX="\\{((\\{((-?([0-9.])+),?)+}),?)+}";     //матрицы

    //этот паттерн весьма несовершенный, т.к. операции вида
    //3.0 * -4.1 работать не смогут. Проблему решим позднее.
    static final String OPERATION="[-+*/]";                             //операция
}
