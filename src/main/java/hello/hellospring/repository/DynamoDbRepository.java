//package hello.hellospring.repository;
//
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
//import hello.hellospring.domain.Member;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//
//@Repository
//public class DynamoDbRepository implements MemberRepository {
//
//    @Autowired
//    private DynamoDBMapper dynamoDBMapper;
//
//    @Override
//    public Member save(Member member) {
//        dynamoDBMapper.save(member);
//        return member;
//    }
//
//    @Override
//    public Member findById(Long id) {
//        return dynamoDBMapper.load(Member.class, id);
//    }
//
//    @Override
//    public Member findByName(String name) {
//        return dynamoDBMapper.load(Member.class, name);
//    }
//
//    @Override
//    public List<Member> findAll() {
//        return null;
//    }
//}
