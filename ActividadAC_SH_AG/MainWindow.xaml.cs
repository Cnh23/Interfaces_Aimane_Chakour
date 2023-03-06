using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace ActividadAC_SH_AG
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void BtnBerlin_Click(object sender, RoutedEventArgs e)
        {
            btnBerlin.Background = Brushes.Red;
        }
        private void BtnLondres_Click(object sender, RoutedEventArgs e)
        {
            btnLondres.Background = Brushes.Red;
        }
        private void BtnParis_Click(object sender, RoutedEventArgs e)
        {
            btnSiguiente.Visibility = Visibility.Visible;
            btnParis.Background = Brushes.Green;
        }
        private void BtnRoma_Click(object sender, RoutedEventArgs e)
        {
            btnRoma.Background = Brushes.Red;
        }

        private void BtnEmpezarJuego_Click(object sender, EventArgs e)
        {
            List<Participante> participantes = new List<Participante>();

            // Crear un nuevo Participante con el nombre del TextBoxNombre
            string nombre = txtNombre.Text;
            string apellido = txtApellido.Text;
            Participante nuevoParticipante = new Participante(nombre, apellido);

            // Agregar el nuevo participante a la lista de participantes
            participantes.Add(nuevoParticipante);

            // Ocultar la primera pestaña y mostrar la segunda
            tabControl.SelectedIndex = 1;
        }
    }
}
