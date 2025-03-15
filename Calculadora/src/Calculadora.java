public class Calculadora {

    /** Método para somar dois valores.
     *
     * @param v1
     * @param v2
     * @return a soma dos valores.
     */
    public double somar(final double v1, final double v2) {
        return v1 + v2;
    }

    /** Método para subtrair dois valores.
     *
     * @param v1
     * @param v2
     * @return retorna a diferença entre os valores.
     */
    public double subtrair(final double v1, final double v2) {
        return v1 - v2;
    }

    /** Método para multiplicar dois valores.
     *
     * @param v1
     * @param v2
     * @return retorna o produto entre os valores.
     */
    public double multiplicar(final double v1, final double v2) {
        return v1 * v2;
    }

    /** Método para dividir dois valores.
     *
     * @param v1
     * @param v2
     * @return retorna o quociente do primeiro valor pelo segundo.
     */
    public double dividir(final double v1, final double v2) {
        // Verificação para evitar divisão por zero
        if (v2 == 0) {
            throw new IllegalArgumentException("Impossível dividir por zero.");
        }
        return v1 / v2;
    }
}
