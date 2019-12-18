Public Class Form1

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        tb_FechaNacimientoDeclarante.BackColor = Color.Gray

        tb_FechaNacimientoConyuge.BackColor = Color.Gray

        tb_DeclaranteNIF.BackColor = Color.Gray

        tb_ConyugeNIF.BackColor = Color.Gray

        tb_ApellidosNombreDeclarante.BackColor = Color.Gray

        tb_ApellidosNombreConyuge.BackColor = Color.Gray
    End Sub

    'Fecha Nacimiento Declarante
    Private Sub tb_FechaNacimientoDeclarante_GotFocus(ByVal sender As Object, ByVal e As System.EventArgs) Handles tb_FechaNacimientoDeclarante.GotFocus
        tb_FechaNacimientoDeclarante.BackColor = Color.Yellow
    End Sub
    Private Sub tb_FechaNacimientoDeclarante_LostFocus(ByVal sender As Object, ByVal e As System.EventArgs) Handles tb_FechaNacimientoDeclarante.LostFocus
        tb_FechaNacimientoDeclarante.BackColor = Color.White
    End Sub

    'Fecha Nacimiento Conyuge
    Private Sub tb_FechaNacimientoConyuge_GotFocus(ByVal sender As Object, ByVal e As System.EventArgs) Handles tb_FechaNacimientoConyuge.GotFocus
        tb_FechaNacimientoConyuge.BackColor = Color.Yellow
    End Sub
    Private Sub tb_FechaNacimientoConyuge_LostFocus(ByVal sender As Object, ByVal e As System.EventArgs) Handles tb_FechaNacimientoConyuge.LostFocus
        tb_FechaNacimientoConyuge.BackColor = Color.White
    End Sub

    'NIF Declarante
    Private Sub tb_DeclaranteNIF_GotFocus(ByVal sender As Object, ByVal e As System.EventArgs) Handles tb_DeclaranteNIF.GotFocus
        tb_DeclaranteNIF.BackColor = Color.Yellow
    End Sub
    Private Sub tb_DeclaranteNIF_LostFocus(ByVal sender As Object, ByVal e As System.EventArgs) Handles tb_DeclaranteNIF.LostFocus
        tb_DeclaranteNIF.BackColor = Color.White
    End Sub

    'NIF Conyuge
    Private Sub tb_ConyugeNIF_GotFocus(ByVal sender As Object, ByVal e As System.EventArgs) Handles tb_ConyugeNIF.GotFocus
        tb_ConyugeNIF.BackColor = Color.Yellow
    End Sub
    Private Sub tb_ConyugeNIF_LostFocus(ByVal sender As Object, ByVal e As System.EventArgs) Handles tb_ConyugeNIF.LostFocus
        tb_ConyugeNIF.BackColor = Color.White
    End Sub

    'Apellidos y nombre Declarante
    Private Sub tb_ApellidosNombreDeclarante_GotFocus(ByVal sender As Object, ByVal e As System.EventArgs) Handles tb_ApellidosNombreDeclarante.GotFocus
        tb_ApellidosNombreDeclarante.BackColor = Color.Yellow
    End Sub
    Private Sub tb_ApellidosNombreDeclarante_LostFocus(ByVal sender As Object, ByVal e As System.EventArgs) Handles tb_ApellidosNombreDeclarante.LostFocus
        tb_ApellidosNombreDeclarante.BackColor = Color.White
    End Sub

    'Apellido y nombre Conyuge
    Private Sub tb_ApellidosNombreConyuge_GotFocus(ByVal sender As Object, ByVal e As System.EventArgs) Handles tb_ApellidosNombreConyuge.GotFocus
        tb_ApellidosNombreConyuge.BackColor = Color.Yellow
    End Sub
    Private Sub tb_ApellidosNombreConyuge_LostFocus(ByVal sender As Object, ByVal e As System.EventArgs) Handles tb_ApellidosNombreConyuge.LostFocus
        tb_ApellidosNombreConyuge.BackColor = Color.White
    End Sub

    Private Sub tb_Soltero_KeyPress(ByVal sender As Object, ByVal e As System.Windows.Forms.KeyEventArgs) Handles tb_Soltero.KeyDown
        e.Handled = True
        tb_Soltero.Text = "X"
    End Sub
    Private Sub tb_Casado_KeyPress(ByVal sender As Object, ByVal e As System.Windows.Forms.KeyPressEventArgs) Handles tb_Casado.KeyPress
        e.Handled = True
        tb_Casado.Text = "X"
    End Sub
    Private Sub tb_Viudo_KeyPress(ByVal sender As Object, ByVal e As System.Windows.Forms.KeyPressEventArgs) Handles tb_Viudo.KeyPress
        e.Handled = True
        tb_Viudo.Text = "X"
    End Sub
    Private Sub tb_Separado_KeyPress(ByVal sender As Object, ByVal e As System.Windows.Forms.KeyPressEventArgs) Handles tb_Separado.KeyPress
        e.Handled = True
        tb_Separado.Text = "X"
    End Sub

    'Habilitar campos
    Private Sub tb_Soltero_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles tb_Soltero.TextChanged
        tb_Casado.Enabled = False
        tb_Viudo.Enabled = False
        tb_Separado.Enabled = False

        tb_FechaNacimientoDeclarante.Enabled = True
        tb_FechaNacimientoDeclarante.BackColor = Color.White

        tb_DeclaranteNIF.Enabled = True
        tb_DeclaranteNIF.BackColor = Color.White

        tb_ApellidosNombreDeclarante.Enabled = True
        tb_ApellidosNombreDeclarante.BackColor = Color.White
    End Sub
    Private Sub tb_Casado_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles tb_Casado.TextChanged
        tb_Soltero.Enabled = False
        tb_Viudo.Enabled = False
        tb_Separado.Enabled = False

        tb_FechaNacimientoDeclarante.Enabled = True
        tb_FechaNacimientoDeclarante.BackColor = Color.White

        tb_FechaNacimientoConyuge.Enabled = True
        tb_FechaNacimientoConyuge.BackColor = Color.White

        tb_DeclaranteNIF.Enabled = True
        tb_DeclaranteNIF.BackColor = Color.White

        tb_ConyugeNIF.Enabled = True
        tb_ConyugeNIF.BackColor = Color.White

        tb_ApellidosNombreDeclarante.Enabled = True
        tb_ApellidosNombreDeclarante.BackColor = Color.White

        tb_ApellidosNombreConyuge.Enabled = True
        tb_ApellidosNombreConyuge.BackColor = Color.White
    End Sub
    Private Sub tb_Viudo_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles tb_Viudo.TextChanged
        tb_Casado.Enabled = False
        tb_Soltero.Enabled = False
        tb_Separado.Enabled = False

        tb_FechaNacimientoDeclarante.Enabled = True
        tb_FechaNacimientoDeclarante.BackColor = Color.White

        tb_DeclaranteNIF.Enabled = True
        tb_DeclaranteNIF.BackColor = Color.White

        tb_ApellidosNombreDeclarante.Enabled = True
        tb_ApellidosNombreDeclarante.BackColor = Color.White
    End Sub
    Private Sub tb_Separado_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles tb_Separado.TextChanged
        tb_Casado.Enabled = False
        tb_Viudo.Enabled = False
        tb_Soltero.Enabled = False

        tb_FechaNacimientoDeclarante.Enabled = True
        tb_FechaNacimientoDeclarante.BackColor = Color.White

        tb_DeclaranteNIF.Enabled = True
        tb_DeclaranteNIF.BackColor = Color.White

        tb_ApellidosNombreDeclarante.Enabled = True
        tb_ApellidosNombreDeclarante.BackColor = Color.White
    End Sub
End Class
