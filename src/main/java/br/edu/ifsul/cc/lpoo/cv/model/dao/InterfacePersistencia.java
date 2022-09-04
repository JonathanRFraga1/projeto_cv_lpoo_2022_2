package br.edu.ifsul.cc.lpoo.cv.model.dao;

public interface InterfacePersistencia {
    public boolean conexaoAberta();

    public void fecharConexao();

    public Object find(Class c, Object id) throws Exception;

    public Object persist(Object o) throws Exception;

    public void remove(Object o) throws Exception;
}
