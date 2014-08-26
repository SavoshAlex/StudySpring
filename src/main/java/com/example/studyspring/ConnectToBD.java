package com.example.studyspring;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnectToBD {

    private final static Logger LOG = Logger.getLogger(ConnectToBD.class);

    public static void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"myMock.xml"});
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"IPSConnection.xml"});
        DataSource ds = (DataSource) context.getBean("dsIPS");
        Connection con = null;
        try {
            con = ds.getConnection();
            if (con == null) {
                LOG.info("Connection isn't create");
            } else {
                Statement st = null;
                ResultSet rs = null;
                try {
                    st = con.createStatement();
                    rs = st.executeQuery("select top 10 * from LDAP");
                    while(rs.next()){
                        LOG.info(rs.getString("LDAP_Login"));
                    }
                } catch (SQLException e) {
                    LOG.error(e.getMessage());
                    LOG.debug(e.getMessage(), e);
                } finally {
                    if(st != null){
                        try {
                            st.close();
                        } catch (SQLException ex) {
                            LOG.error(ex.getMessage());
                            LOG.debug(ex.getMessage(), ex);
                        }
                    }
                    if(rs != null){
                        try {
                            rs.close();
                        } catch (SQLException ex) {
                            LOG.error(ex.getMessage());
                            LOG.debug(ex.getMessage(), ex);
                        }
                    }
                }
            }
        } catch (SQLException ex) {
            LOG.error(ex.getMessage());
            LOG.debug(ex.getMessage(), ex);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    LOG.error(ex.getMessage());
                    LOG.debug(ex.getMessage(), ex);
                }
            }
        }

    }

}
