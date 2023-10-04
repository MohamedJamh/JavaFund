package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getCnxDbString());
        System.out.println(getDataBaseSupplier.get());
    }

    static Supplier<List<String>> getDataBaseSupplier = () -> List.of(
            "jdbc://localhost:5432/users",
            "root",
            "password");
    static String getCnxDbString(){
        return "jdbc://localhost:5432/users";
    }
}
