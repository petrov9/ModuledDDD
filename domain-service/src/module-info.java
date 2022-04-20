module org.example.domain_service {
    requires org.example.domain;

    exports org.example.domain_service to org.example.app_service;
}