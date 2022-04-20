module org.example.app_service {
    requires org.example.domain;

    exports org.example.app_service.port.driving to org.example.presentation;
    exports org.example.app_service.port.driven to org.example.infrastructure;
}