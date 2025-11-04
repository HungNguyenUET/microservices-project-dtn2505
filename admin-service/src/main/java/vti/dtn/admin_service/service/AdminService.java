package vti.dtn.admin_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vti.dtn.admin_service.dto.DepartmentDTO;
import vti.dtn.admin_service.feginclient.DepartmentFeignClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminService {
    private static final String DEFAULT_TOPIC = "test-topic";
    private static final String SUCCESS_MESSAGE = "Message sent successfully";

    private final KafkaProducerService kafkaProducerService;
    private final DepartmentFeignClient departmentFeignClient;

    public List<DepartmentDTO> getDepartments() {
        return departmentFeignClient.getAllDepartments();
    }

    public String sendMsgKafka(String message) {
        kafkaProducerService.sendMessage(DEFAULT_TOPIC, message);
        return SUCCESS_MESSAGE;
    }

}
