import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class TableViewer extends JFrame {
    public TableViewer() {
        setTitle("Catálogo de Jogos");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {"ID", "Título", "Gênero", "Desenvolvedora", "Data de Lançamento", "Data de Cadastro"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);

        try (Connection conn = DatabaseConnection.connect()) {
            String query = "SELECT * FROM jogos";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("genero"),
                    rs.getString("desenvolvedora"),
                    rs.getDate("data_lancamento"),
                    rs.getTimestamp("data_cadastro")
                };
                tableModel.addRow(row);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco: " + e.getMessage());
        }

        add(new JScrollPane(table));
    }
}
