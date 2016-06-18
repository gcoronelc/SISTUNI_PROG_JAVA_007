package pe.egcc.matedemo.controller;

import pe.egcc.lib.MateLib;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class DemoController {
  
  private MateLib service;

  public DemoController() {
    service = new MateLib();
  }
  
  

  public int promediar(int n1, int n2) {
    return service.promediar(n1, n2);
  }
  
}
