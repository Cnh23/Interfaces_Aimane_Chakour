using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ActividadAC_SH_AG
{
    public class Participante
    {
        public string Nombre { get; set; }
        public string Apellido { get; set; }
        public int Puntuacion { get; set; }
        public Participante(string nombre, string apellido)
        {
            Nombre = nombre;
            Apellido = apellido;
        }
    }
}
