import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql:                                                     
            BookDAO bookDAO = new BookDAO(connection);
            CustomerDAO customerDAO = new CustomerDAO(connection);
            OrderDAO orderDAO = new OrderDAO(connection);

                             
            Book book = new Book();
            book.setTitle("//localhost:3306/bookstore", "username", "password");
            BookDAO bookDAO = new BookDAO(connection);
            CustomerDAO customerDAO = new CustomerDAO(connection);
            OrderDAO orderDAO = new OrderDAO(connection);

            // Add a new book
            Book book = new Book();
            book.setTitle("Book Title");
            book.setAuthor("Author Name");
            book.setPrice(19.99);
            book.setQuantity(10);
            bookDAO.addBook(book);

                                 
            Customer customer = new Customer();
            customer.setName("// Add a new customer
            Customer customer = new Customer();
            customer.setName("Customer Name");
            customer.setEmail("customer@example.com");
            customer.setPhone("123-456-7890");
            customerDAO.addCustomer(customer);

                              
            Order order = new Order();
            order.setCustomerId(1);
            order.setBookId(1);
            order.setDate("// Add a new order
            Order order = new Order();
            order.setCustomerId(1);
            order.setBookId(1);
            order.setDate("2023-03-01");
            order.setTotal(19.99);
            orderDAO.addOrder(order);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
