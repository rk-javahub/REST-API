package com.chirpn.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import org.hibernate.annotations.NaturalId;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Contact {
	@NaturalId
	private String mobileNo;
	private String address_line_1;
	private String address_line_2;
	@OneToOne(mappedBy = "contact")
	private Author author;
}
