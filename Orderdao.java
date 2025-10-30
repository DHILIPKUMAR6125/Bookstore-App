import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {
    private Connection connection;

    public OrderDAO(Connection connection) {
        this.connection = connection;
    }

    public void addOrder(Order order) throws SQLException {
        String query = "INSERT INTO orders (customer_id, book_id, date, total) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, order.getCustomerId());
        statement.setInt(2, order.getBookId());
        statement.setString(3, order.getDate());
        statement.setDouble(4, order.getTotal());
        statement.executeUpdate();
    }

    public List<Order> getAllOrders() throws SQLException {
        String query = "SELECT * FROM orders";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        List<Order> orders = new ArrayList<>();

        while (resultSet.next()) {
            Order order = new Order();
            order.setId(resultSet.getInt("id"));
            order.setCustomerId(resultSet.getInt("customer_id"));
            order.setBookId(resultSet.getInt("book_id"));
            order.setDate(resultSet.getString("date"));
            order.setTotal(resultSet.getDouble("total"));
            orders.add(order);
        }

        return orders;
    }
}
