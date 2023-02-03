package com.example.northWind.entity;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "com.example.northWind.entity.Invoices")
@Table(name = "invoices")
public class Invoices {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"order_id\"", nullable = true)
  private Integer orderId;
  @Column(name = "\"invoice_date\"", nullable = true)
  private Timestamp invoiceDate;
  @Column(name = "\"due_date\"", nullable = true)
  private Timestamp dueDate;
  @Column(name = "\"tax\"", nullable = true)
  private java.math.BigDecimal tax;
  @Column(name = "\"shipping\"", nullable = true)
  private java.math.BigDecimal shipping;
  @Column(name = "\"amount_due\"", nullable = true)
  private java.math.BigDecimal amountDue;
}