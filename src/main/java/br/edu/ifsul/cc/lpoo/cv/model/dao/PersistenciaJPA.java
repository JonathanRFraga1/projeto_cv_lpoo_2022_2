package br.edu.ifsul.cc.lpoo.cv.model.dao;

public class PersistenciaJPA implements InterfacePersistencia{
    @Override
    public boolean conexaoAberta() {
        return false;
    }

    @Override
    public void fecharConexao() {

    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        return null;
    }

    @Override
    public Object persist(Object o) throws Exception {
        return null;
    }

    @Override
    public void remove(Object o) throws Exception {

    }
}
