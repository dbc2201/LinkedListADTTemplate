/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 29/01/20
 *   Time: 9:21 AM
 */

package execution;

import definition.LinkedListDefinitionClass;

public class Main {
    public static void main(String[] args) {
        LinkedListDefinitionClass<Integer> list =
                new LinkedListDefinitionClass<>();
        list.print();
        list.add(4);
        list.add(4);
        list.add(4);
        list.print();
    }
}
