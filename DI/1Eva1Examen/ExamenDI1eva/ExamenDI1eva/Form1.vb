Public Class Form1

    Public Sub GrabarFichero()
        Dim swEscritor As System.IO.StreamWriter
        ' creamos un stream de escritura, y al mismo tiempo un
        ' nuevo archivo para escribir texto sobre �l
        swEscritor = New System.IO.StreamWriter("C:\Users\Alumnos\Desktop\Fichero.txt", False)
        ' escribir l�neas
        swEscritor.WriteLine(tb_general.Text)
        ' cerrar el stream y el archivo asociado
        swEscritor.Close()
    End Sub

    Private Sub GuardarToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles GuardarToolStripMenuItem.Click
        GrabarFichero()
    End Sub
End Class