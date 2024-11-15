package project.project22_jspcrudfullstack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ForumDAO {
    Connection con = null;

    private final String FORUM_INSERT = "insert into forum_data (name, title, phone, post_type, user_type) values (?,?,?,?,?)";
    private final String FORUM_LIST = "select * from forum_data order by id desc";
    private final String FORUM_DELETE = "delete from forum_data where id=?";
    private final String FORUM_UPDATE = "update forum_data set name=?,title=?,phone=?,post_type=?,user_type=? where id=?";
    private final String FORUM_GET = "select * from forum_data where id=?";

    private int makeConnection(){
        con = db_util.getConnection();
        if(con == null){
            System.out.println("DB Connection Error!");
            return -1; //for DB error
        }
        return 1;
    }

    public ArrayList<ForumVO> getForumList(){
        PreparedStatement pst = null; ResultSet rs = null;
        int con_result = makeConnection();
        if(con_result == -1){
            return null;
        }
        try{
            pst = con.prepareStatement(FORUM_LIST);
            rs = pst.executeQuery();
            if(!rs.next()){
                System.out.println("No data in DB");
                return new ArrayList<>();
            }
            ArrayList<ForumVO> forumList = new ArrayList<>();
            do{
                ForumVO forum = new ForumVO(rs.getInt("id"), rs.getString("name"),
                        rs.getString("title"), rs.getString("phone"),
                        rs.getString("post_type"), rs.getString("user_type"),
                        rs.getTimestamp("add_date").toLocalDateTime());
                forumList.add(forum);
            }while(rs.next());
            rs.close();
            pst.close();
            return forumList;
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public ForumVO getForumPost(int id){
        PreparedStatement pst = null; ResultSet rs = null;
        int con_result = makeConnection();
        if(con_result == -1){
            return null;
        }
        try{
            pst = con.prepareStatement(FORUM_GET);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if(!rs.next()){
                System.out.println("No data in DB");
                return new ForumVO();
            }
            ForumVO post = new ForumVO(rs.getInt("id"), rs.getString("name"),
                    rs.getString("title"), rs.getString("phone"),
                    rs.getString("post_type"), rs.getString("user_type"),
                    rs.getTimestamp("add_date").toLocalDateTime());
            pst.close();
            rs.close();
            return post;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int insertForum(ForumVO vo){
        PreparedStatement pst = null;
        int con_result = makeConnection();
        if(con_result == -1){
            return con_result;
        }
        try{
            pst = con.prepareStatement(FORUM_INSERT);
            pst.setString(1, vo.getName());
            pst.setString(2, vo.getTitle());
            pst.setString(3, vo.getPhone());
            pst.setString(4, vo.getPost_type());
            pst.setString(5, vo.getUser_type());
            pst.executeUpdate();
            pst.close();
            return 1; //for successful execution
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int deleteForum(int id){
        PreparedStatement pst = null;
        int con_result = makeConnection();
        if(con_result == -1){
            return con_result;
        }
        try{
            pst = con.prepareStatement(FORUM_DELETE);
            pst.setInt(1, id);
            pst.executeUpdate();
            pst.close();
            return 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int updateForum(ForumVO post){
        PreparedStatement pst = null;
        int con_result = makeConnection();
        if(con_result == -1){
            return con_result;
        }
        try{
            pst = con.prepareStatement(FORUM_UPDATE);
            pst.setString(1, post.getName());
            pst.setString(2, post.getTitle());
            pst.setString(3, post.getPhone());
            pst.setString(4, post.getPost_type());
            pst.setString(5, post.getUser_type());
            pst.setInt(6, post.getId());
            pst.executeUpdate();
            pst.close();
            return 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
