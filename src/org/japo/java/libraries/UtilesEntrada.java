/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class UtilesEntrada {
    
     public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final String MSG_USR = "Introducir número ....: ";
    public static final String MSG_ERR = "ERROR: Entrada incorrecta";
    public static final String RESULTADO = "Número introducido ...: ";
    
    public static final double obtener(String msgUsr, String msgErr) {
        double nUsuario = 0;
        boolean errorOK = false;

        do {
            try {

                System.out.print(MSG_USR);
                nUsuario = SCN.nextDouble();
                errorOK = true;
                SCN.nextLine();

            } catch (Exception e) {
                System.out.println(MSG_ERR);
                System.out.println("---");

            } finally {

            }
        } while (!errorOK);

        return nUsuario;
    }
    
}
