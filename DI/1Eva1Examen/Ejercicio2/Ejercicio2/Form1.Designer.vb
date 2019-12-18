<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        If disposing AndAlso components IsNot Nothing Then
            components.Dispose()
        End If
        MyBase.Dispose(disposing)
    End Sub

    'Requerido por el Diseñador de Windows Forms
    Private components As System.ComponentModel.IContainer

    'NOTA: el Diseñador de Windows Forms necesita el siguiente procedimiento
    'Se puede modificar usando el Diseñador de Windows Forms.  
    'No lo modifique con el editor de código.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.gb_EstadoCivil = New System.Windows.Forms.GroupBox
        Me.tb_Separado = New System.Windows.Forms.TextBox
        Me.Label_Separado = New System.Windows.Forms.Label
        Me.tb_Viudo = New System.Windows.Forms.TextBox
        Me.Label_Viudo = New System.Windows.Forms.Label
        Me.tb_Casado = New System.Windows.Forms.TextBox
        Me.Label_Soltero = New System.Windows.Forms.Label
        Me.tb_Soltero = New System.Windows.Forms.TextBox
        Me.Label_Casado = New System.Windows.Forms.Label
        Me.gb_Fechas = New System.Windows.Forms.GroupBox
        Me.tb_FechaNacimientoConyuge = New System.Windows.Forms.TextBox
        Me.tb_FechaNacimientoDeclarante = New System.Windows.Forms.TextBox
        Me.Label_FechaNacimientoConyuge = New System.Windows.Forms.Label
        Me.Label_FechaNacimientoDeclarante = New System.Windows.Forms.Label
        Me.gb_NIF = New System.Windows.Forms.GroupBox
        Me.tb_ConyugeNIF = New System.Windows.Forms.TextBox
        Me.Label_ConyugeNIF = New System.Windows.Forms.Label
        Me.tb_DeclaranteNIF = New System.Windows.Forms.TextBox
        Me.Label_DeclaranteNIF = New System.Windows.Forms.Label
        Me.GroupBox_ApellidosNombre = New System.Windows.Forms.GroupBox
        Me.tb_ApellidosNombreConyuge = New System.Windows.Forms.TextBox
        Me.Label_NombreConyuge = New System.Windows.Forms.Label
        Me.tb_ApellidosNombreDeclarante = New System.Windows.Forms.TextBox
        Me.Label_NombreDeclarante = New System.Windows.Forms.Label
        Me.gb_EstadoCivil.SuspendLayout()
        Me.gb_Fechas.SuspendLayout()
        Me.gb_NIF.SuspendLayout()
        Me.GroupBox_ApellidosNombre.SuspendLayout()
        Me.SuspendLayout()
        '
        'gb_EstadoCivil
        '
        Me.gb_EstadoCivil.Controls.Add(Me.tb_Separado)
        Me.gb_EstadoCivil.Controls.Add(Me.Label_Separado)
        Me.gb_EstadoCivil.Controls.Add(Me.tb_Viudo)
        Me.gb_EstadoCivil.Controls.Add(Me.Label_Viudo)
        Me.gb_EstadoCivil.Controls.Add(Me.tb_Casado)
        Me.gb_EstadoCivil.Controls.Add(Me.Label_Soltero)
        Me.gb_EstadoCivil.Controls.Add(Me.tb_Soltero)
        Me.gb_EstadoCivil.Controls.Add(Me.Label_Casado)
        Me.gb_EstadoCivil.Location = New System.Drawing.Point(12, 12)
        Me.gb_EstadoCivil.Name = "gb_EstadoCivil"
        Me.gb_EstadoCivil.Size = New System.Drawing.Size(763, 87)
        Me.gb_EstadoCivil.TabIndex = 0
        Me.gb_EstadoCivil.TabStop = False
        Me.gb_EstadoCivil.Text = "Estado Civil"
        '
        'tb_Separado
        '
        Me.tb_Separado.Location = New System.Drawing.Point(656, 35)
        Me.tb_Separado.Name = "tb_Separado"
        Me.tb_Separado.Size = New System.Drawing.Size(45, 20)
        Me.tb_Separado.TabIndex = 8
        '
        'Label_Separado
        '
        Me.Label_Separado.AutoSize = True
        Me.Label_Separado.Location = New System.Drawing.Point(583, 25)
        Me.Label_Separado.Name = "Label_Separado"
        Me.Label_Separado.Size = New System.Drawing.Size(67, 39)
        Me.Label_Separado.TabIndex = 7
        Me.Label_Separado.Text = "Separado/a" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "o legalmente" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "divorciado/a"
        '
        'tb_Viudo
        '
        Me.tb_Viudo.Location = New System.Drawing.Point(463, 35)
        Me.tb_Viudo.Name = "tb_Viudo"
        Me.tb_Viudo.Size = New System.Drawing.Size(45, 20)
        Me.tb_Viudo.TabIndex = 6
        '
        'Label_Viudo
        '
        Me.Label_Viudo.AutoSize = True
        Me.Label_Viudo.Location = New System.Drawing.Point(412, 38)
        Me.Label_Viudo.Name = "Label_Viudo"
        Me.Label_Viudo.Size = New System.Drawing.Size(45, 13)
        Me.Label_Viudo.TabIndex = 5
        Me.Label_Viudo.Text = "Viudo/a"
        '
        'tb_Casado
        '
        Me.tb_Casado.Location = New System.Drawing.Point(286, 35)
        Me.tb_Casado.Name = "tb_Casado"
        Me.tb_Casado.Size = New System.Drawing.Size(45, 20)
        Me.tb_Casado.TabIndex = 4
        '
        'Label_Soltero
        '
        Me.Label_Soltero.AutoSize = True
        Me.Label_Soltero.Location = New System.Drawing.Point(61, 38)
        Me.Label_Soltero.Name = "Label_Soltero"
        Me.Label_Soltero.Size = New System.Drawing.Size(51, 13)
        Me.Label_Soltero.TabIndex = 3
        Me.Label_Soltero.Text = "Soltero/a"
        '
        'tb_Soltero
        '
        Me.tb_Soltero.Location = New System.Drawing.Point(118, 35)
        Me.tb_Soltero.Name = "tb_Soltero"
        Me.tb_Soltero.Size = New System.Drawing.Size(45, 20)
        Me.tb_Soltero.TabIndex = 2
        '
        'Label_Casado
        '
        Me.Label_Casado.AutoSize = True
        Me.Label_Casado.Location = New System.Drawing.Point(226, 38)
        Me.Label_Casado.Name = "Label_Casado"
        Me.Label_Casado.Size = New System.Drawing.Size(54, 13)
        Me.Label_Casado.TabIndex = 1
        Me.Label_Casado.Text = "Casado/a"
        '
        'gb_Fechas
        '
        Me.gb_Fechas.Controls.Add(Me.tb_FechaNacimientoConyuge)
        Me.gb_Fechas.Controls.Add(Me.tb_FechaNacimientoDeclarante)
        Me.gb_Fechas.Controls.Add(Me.Label_FechaNacimientoConyuge)
        Me.gb_Fechas.Controls.Add(Me.Label_FechaNacimientoDeclarante)
        Me.gb_Fechas.Location = New System.Drawing.Point(12, 118)
        Me.gb_Fechas.Name = "gb_Fechas"
        Me.gb_Fechas.Size = New System.Drawing.Size(380, 100)
        Me.gb_Fechas.TabIndex = 1
        Me.gb_Fechas.TabStop = False
        '
        'tb_FechaNacimientoConyuge
        '
        Me.tb_FechaNacimientoConyuge.Enabled = False
        Me.tb_FechaNacimientoConyuge.Location = New System.Drawing.Point(226, 58)
        Me.tb_FechaNacimientoConyuge.Name = "tb_FechaNacimientoConyuge"
        Me.tb_FechaNacimientoConyuge.Size = New System.Drawing.Size(100, 20)
        Me.tb_FechaNacimientoConyuge.TabIndex = 3
        '
        'tb_FechaNacimientoDeclarante
        '
        Me.tb_FechaNacimientoDeclarante.Enabled = False
        Me.tb_FechaNacimientoDeclarante.Location = New System.Drawing.Point(226, 25)
        Me.tb_FechaNacimientoDeclarante.Name = "tb_FechaNacimientoDeclarante"
        Me.tb_FechaNacimientoDeclarante.Size = New System.Drawing.Size(100, 20)
        Me.tb_FechaNacimientoDeclarante.TabIndex = 2
        '
        'Label_FechaNacimientoConyuge
        '
        Me.Label_FechaNacimientoConyuge.AutoSize = True
        Me.Label_FechaNacimientoConyuge.Location = New System.Drawing.Point(6, 61)
        Me.Label_FechaNacimientoConyuge.Name = "Label_FechaNacimientoConyuge"
        Me.Label_FechaNacimientoConyuge.Size = New System.Drawing.Size(182, 13)
        Me.Label_FechaNacimientoConyuge.TabIndex = 1
        Me.Label_FechaNacimientoConyuge.Text = "Fecha de nacimiento del cónyuge ...."
        '
        'Label_FechaNacimientoDeclarante
        '
        Me.Label_FechaNacimientoDeclarante.AutoSize = True
        Me.Label_FechaNacimientoDeclarante.Location = New System.Drawing.Point(6, 28)
        Me.Label_FechaNacimientoDeclarante.Name = "Label_FechaNacimientoDeclarante"
        Me.Label_FechaNacimientoDeclarante.Size = New System.Drawing.Size(191, 13)
        Me.Label_FechaNacimientoDeclarante.TabIndex = 0
        Me.Label_FechaNacimientoDeclarante.Text = "Fecha de nacimiento del declarante ...."
        '
        'gb_NIF
        '
        Me.gb_NIF.Controls.Add(Me.tb_ConyugeNIF)
        Me.gb_NIF.Controls.Add(Me.Label_ConyugeNIF)
        Me.gb_NIF.Controls.Add(Me.tb_DeclaranteNIF)
        Me.gb_NIF.Controls.Add(Me.Label_DeclaranteNIF)
        Me.gb_NIF.Location = New System.Drawing.Point(398, 118)
        Me.gb_NIF.Name = "gb_NIF"
        Me.gb_NIF.Size = New System.Drawing.Size(377, 100)
        Me.gb_NIF.TabIndex = 2
        Me.gb_NIF.TabStop = False
        Me.gb_NIF.Text = "NIF"
        '
        'tb_ConyugeNIF
        '
        Me.tb_ConyugeNIF.Enabled = False
        Me.tb_ConyugeNIF.Location = New System.Drawing.Point(270, 40)
        Me.tb_ConyugeNIF.Name = "tb_ConyugeNIF"
        Me.tb_ConyugeNIF.Size = New System.Drawing.Size(100, 20)
        Me.tb_ConyugeNIF.TabIndex = 3
        '
        'Label_ConyugeNIF
        '
        Me.Label_ConyugeNIF.AutoSize = True
        Me.Label_ConyugeNIF.Location = New System.Drawing.Point(215, 43)
        Me.Label_ConyugeNIF.Name = "Label_ConyugeNIF"
        Me.Label_ConyugeNIF.Size = New System.Drawing.Size(49, 13)
        Me.Label_ConyugeNIF.TabIndex = 2
        Me.Label_ConyugeNIF.Text = "Cónyuge"
        '
        'tb_DeclaranteNIF
        '
        Me.tb_DeclaranteNIF.Enabled = False
        Me.tb_DeclaranteNIF.Location = New System.Drawing.Point(78, 40)
        Me.tb_DeclaranteNIF.Name = "tb_DeclaranteNIF"
        Me.tb_DeclaranteNIF.Size = New System.Drawing.Size(100, 20)
        Me.tb_DeclaranteNIF.TabIndex = 1
        '
        'Label_DeclaranteNIF
        '
        Me.Label_DeclaranteNIF.AutoSize = True
        Me.Label_DeclaranteNIF.Location = New System.Drawing.Point(13, 43)
        Me.Label_DeclaranteNIF.Name = "Label_DeclaranteNIF"
        Me.Label_DeclaranteNIF.Size = New System.Drawing.Size(59, 13)
        Me.Label_DeclaranteNIF.TabIndex = 0
        Me.Label_DeclaranteNIF.Text = "Declarante"
        '
        'GroupBox_ApellidosNombre
        '
        Me.GroupBox_ApellidosNombre.Controls.Add(Me.tb_ApellidosNombreConyuge)
        Me.GroupBox_ApellidosNombre.Controls.Add(Me.Label_NombreConyuge)
        Me.GroupBox_ApellidosNombre.Controls.Add(Me.tb_ApellidosNombreDeclarante)
        Me.GroupBox_ApellidosNombre.Controls.Add(Me.Label_NombreDeclarante)
        Me.GroupBox_ApellidosNombre.Location = New System.Drawing.Point(21, 241)
        Me.GroupBox_ApellidosNombre.Name = "GroupBox_ApellidosNombre"
        Me.GroupBox_ApellidosNombre.Size = New System.Drawing.Size(754, 100)
        Me.GroupBox_ApellidosNombre.TabIndex = 3
        Me.GroupBox_ApellidosNombre.TabStop = False
        Me.GroupBox_ApellidosNombre.Text = "Apellidos y nombre"
        '
        'tb_ApellidosNombreConyuge
        '
        Me.tb_ApellidosNombreConyuge.Enabled = False
        Me.tb_ApellidosNombreConyuge.Location = New System.Drawing.Point(512, 44)
        Me.tb_ApellidosNombreConyuge.Name = "tb_ApellidosNombreConyuge"
        Me.tb_ApellidosNombreConyuge.Size = New System.Drawing.Size(211, 20)
        Me.tb_ApellidosNombreConyuge.TabIndex = 7
        '
        'Label_NombreConyuge
        '
        Me.Label_NombreConyuge.AutoSize = True
        Me.Label_NombreConyuge.Location = New System.Drawing.Point(447, 47)
        Me.Label_NombreConyuge.Name = "Label_NombreConyuge"
        Me.Label_NombreConyuge.Size = New System.Drawing.Size(52, 13)
        Me.Label_NombreConyuge.TabIndex = 6
        Me.Label_NombreConyuge.Text = "Cónyuge:"
        '
        'tb_ApellidosNombreDeclarante
        '
        Me.tb_ApellidosNombreDeclarante.Enabled = False
        Me.tb_ApellidosNombreDeclarante.Location = New System.Drawing.Point(106, 47)
        Me.tb_ApellidosNombreDeclarante.Name = "tb_ApellidosNombreDeclarante"
        Me.tb_ApellidosNombreDeclarante.Size = New System.Drawing.Size(211, 20)
        Me.tb_ApellidosNombreDeclarante.TabIndex = 5
        '
        'Label_NombreDeclarante
        '
        Me.Label_NombreDeclarante.AutoSize = True
        Me.Label_NombreDeclarante.Location = New System.Drawing.Point(41, 50)
        Me.Label_NombreDeclarante.Name = "Label_NombreDeclarante"
        Me.Label_NombreDeclarante.Size = New System.Drawing.Size(62, 13)
        Me.Label_NombreDeclarante.TabIndex = 4
        Me.Label_NombreDeclarante.Text = "Declarante:"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(789, 415)
        Me.Controls.Add(Me.GroupBox_ApellidosNombre)
        Me.Controls.Add(Me.gb_NIF)
        Me.Controls.Add(Me.gb_Fechas)
        Me.Controls.Add(Me.gb_EstadoCivil)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.gb_EstadoCivil.ResumeLayout(False)
        Me.gb_EstadoCivil.PerformLayout()
        Me.gb_Fechas.ResumeLayout(False)
        Me.gb_Fechas.PerformLayout()
        Me.gb_NIF.ResumeLayout(False)
        Me.gb_NIF.PerformLayout()
        Me.GroupBox_ApellidosNombre.ResumeLayout(False)
        Me.GroupBox_ApellidosNombre.PerformLayout()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents gb_EstadoCivil As System.Windows.Forms.GroupBox
    Friend WithEvents tb_Separado As System.Windows.Forms.TextBox
    Friend WithEvents Label_Separado As System.Windows.Forms.Label
    Friend WithEvents tb_Viudo As System.Windows.Forms.TextBox
    Friend WithEvents Label_Viudo As System.Windows.Forms.Label
    Friend WithEvents tb_Casado As System.Windows.Forms.TextBox
    Friend WithEvents Label_Soltero As System.Windows.Forms.Label
    Friend WithEvents tb_Soltero As System.Windows.Forms.TextBox
    Friend WithEvents Label_Casado As System.Windows.Forms.Label
    Friend WithEvents gb_Fechas As System.Windows.Forms.GroupBox
    Friend WithEvents Label_FechaNacimientoConyuge As System.Windows.Forms.Label
    Friend WithEvents Label_FechaNacimientoDeclarante As System.Windows.Forms.Label
    Friend WithEvents tb_FechaNacimientoConyuge As System.Windows.Forms.TextBox
    Friend WithEvents tb_FechaNacimientoDeclarante As System.Windows.Forms.TextBox
    Friend WithEvents gb_NIF As System.Windows.Forms.GroupBox
    Friend WithEvents Label_ConyugeNIF As System.Windows.Forms.Label
    Friend WithEvents tb_DeclaranteNIF As System.Windows.Forms.TextBox
    Friend WithEvents Label_DeclaranteNIF As System.Windows.Forms.Label
    Friend WithEvents tb_ConyugeNIF As System.Windows.Forms.TextBox
    Friend WithEvents GroupBox_ApellidosNombre As System.Windows.Forms.GroupBox
    Friend WithEvents tb_ApellidosNombreConyuge As System.Windows.Forms.TextBox
    Friend WithEvents Label_NombreConyuge As System.Windows.Forms.Label
    Friend WithEvents tb_ApellidosNombreDeclarante As System.Windows.Forms.TextBox
    Friend WithEvents Label_NombreDeclarante As System.Windows.Forms.Label

End Class
