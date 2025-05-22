public class App {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            TableViewer frame = new TableViewer();
            frame.setVisible(true);
        });
    }
}
