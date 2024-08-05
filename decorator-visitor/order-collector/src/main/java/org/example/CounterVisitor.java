package org.example;

public class CounterVisitor {
    int internal;
    int individual;
    int corporate;
    public void visit(InternalOrder order){
        internal++;
    }

    public void visit(IndividualOrder order){
        individual++;
    }

    public void visit(CorporateOrder order){
        corporate++;
    }

    @Override
    public String toString() {
        return "CounterVisitor{" +
                "internal=" + internal +
                ", individual=" + individual +
                ", corporate=" + corporate +
                '}';
    }
}
