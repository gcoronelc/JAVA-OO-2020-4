package pe.uni.aprendiendojava.service;

import pe.uni.aprendiendojava.spec.IMate;

/**
 *
 * @author Gustavo Coronel
 */
public class SumaService implements IMate{

  @Override
  public int ejecutar(int n1, int n2) {
    return (n1+n2);
  }

}
