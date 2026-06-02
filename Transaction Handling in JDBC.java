import java.sql.*;

public class TransactionDemo {

    public static void main(String[] args)
            throws Exception {

        Connection con =
            DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bank",
                "root",
                "root"
            );

        try {

            con.setAutoCommit(false);

            PreparedStatement debit =
                con.prepareStatement(
                "UPDATE accounts SET balance=balance-? WHERE id=?"
                );

            debit.setInt(1,1000);
            debit.setInt(2,1);

            debit.executeUpdate();

            PreparedStatement credit =
                con.prepareStatement(
                "UPDATE accounts SET balance=balance+? WHERE id=?"
                );

            credit.setInt(1,1000);
            credit.setInt(2,2);

            credit.executeUpdate();

            con.commit();

            System.out.println(
                "Transaction Success"
            );

        } catch(Exception e) {

            con.rollback();

            System.out.println(
                "Transaction Failed"
            );
        }
    }
}
